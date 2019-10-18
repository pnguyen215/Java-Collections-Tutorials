package com.phuocnguyen009.Properties;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;
	public final String SET_NAME_FILE = "info.txt";

	public void getInformation() {
		try {
			FileReader fileReader = new FileReader("db.properties");
			Properties properties = new Properties();
			properties.load(fileReader);
			// get information
			System.out.println(properties.getProperty("user"));
			System.out.println(properties.getProperty("password"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public void writeToFileUsingBufferWriter(String contents) throws IOException {
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		fileWriter = new FileWriter(SET_NAME_FILE, true);/* fileWriter = new FileWriter(SET_NAME_FILE); */
		bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(String.valueOf(contents));
		bufferedWriter.close();
		fileWriter.close();
	}

	public void getInformationSystem() throws IOException {
		Properties properties = System.getProperties();
		@SuppressWarnings("rawtypes")
		Set set = properties.entrySet();
		@SuppressWarnings("rawtypes")
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Entry) iterator.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
			writeToFileUsingBufferWriter(entry.getKey() + " = " + entry.getValue());
			writeToFileUsingBufferWriter("\n");
		}
	}

	public void createProperties() {
		Properties properties = new Properties();
		properties.setProperty("name", "phuocnguyenit97");
		properties.setProperty("email", "nguyenhuuphuocit97@gmail.com");
		try {
			properties.store(new FileWriter("info.properties"), "Save info");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

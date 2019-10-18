package com.phuocnguyen002.List.ArrayList.SerializationandDeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;
	private final String DESTINATION = "phuocnguyeninfo.txt"; // file name for save data
	private final int LENGTH = 3;
	private Scanner scanner;

	public ArrayList<Person> createObject() {
		/*
		 * declared all variables
		 */
		List<Person> list = new ArrayList<Person>();
		Person[] person = new Person[LENGTH];
		scanner = new Scanner(System.in);
		String name;
		int age;
		// processing
		for (int i = 0; i < person.length; i++) {
			System.out.println("Enter name for person: " + i);
			name = scanner.nextLine();
			System.out.println("Enter age for person: " + i);
			age = scanner.nextInt();

			person[i] = new Person(name, age); // create new object
			scanner.nextLine();
		}
		// adding object to list
		for (Person obj : person) {
			list.add(obj);
		}
		return (ArrayList<Person>) list;
	}

	public void printOutput() {
		List<Person> list = new ArrayList<Person>();
		list = createObject();
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Person> read() throws IOException, ClassNotFoundException {
		List<Person> list = new ArrayList<Person>();

		File file = new File(DESTINATION);
		if (file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			list = (ArrayList<Person>) objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
			return (ArrayList<Person>) list;
		} else {
			System.out.println("Can not read this file! File is not exist!");
			return null;
		}

	}

	public void save() {
		List<Person> list = new ArrayList<Person>();
		list = createObject();
		try {
			File file = new File(DESTINATION);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			// write content
			objectOutputStream.writeObject(list);
			// close connection
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}
		System.out.println("done!");

	}

	public void printObject() {
		List<Person> list = new ArrayList<Person>();
		try {
			list = read();
			list.forEach(ls -> {
				System.out.println(ls.toString());
			});
		} catch (ClassNotFoundException e) {
			System.out.println("error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}
	}

}

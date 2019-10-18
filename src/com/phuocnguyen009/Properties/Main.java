package com.phuocnguyen009.Properties;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Methods methods = new Methods();
		methods.getInformation();
		System.out.println();
		methods.getInformationSystem();
		System.out.println();
		methods.createProperties();
		System.out.println();
	}

}

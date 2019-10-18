package com.phuocnguyen002.List.ArrayList.WaysToIteratorTheElements;

public class Main {

	public static void main(String[] args) {

		ThroughIteratorInterface throughIteratorInterface = new ThroughIteratorInterface();
		throughIteratorInterface.method();

		System.out.println();

		ThroughThefor_eachloop throughThefor_eachloop = new ThroughThefor_eachloop();
		throughThefor_eachloop.method();

		System.out.println();

		ThroughRemainingWays throughRemainingWays = new ThroughRemainingWays();
		throughRemainingWays.method();
	}

}

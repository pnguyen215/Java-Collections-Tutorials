package com.phuocnguyen001.CollectionsFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public void arrayDequeClass() {
		Deque<String> arrayDeque = new ArrayDeque<String>();
		/*
		 * adding object to ArrayDeque
		 */
		arrayDeque.add("audi");
		arrayDeque.add("bmw");
		arrayDeque.add("bently");

		//
		for (String stringOutput : arrayDeque) {
			System.out.println(stringOutput);
		}
	}
}

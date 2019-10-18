package com.phuocnguyen002.List.ArrayList.WaysToIteratorTheElements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ThroughThefor_eachloop implements Serializable {

	private static final long serialVersionUID = 1L;

	public void method() {
		List<String> list = new ArrayList<String>();

		/*
		 * adding object to list
		 */
		list.add("audi");
		list.add("bmw");
		list.add("ferrari");
		/*
		 * traversing elements
		 */
		for (String string : list) {
			System.out.println(string);
		}
	}
}

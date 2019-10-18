package com.phuocnguyen002.List.ArrayList.WaysToIteratorTheElements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThroughIteratorInterface implements Serializable {

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
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

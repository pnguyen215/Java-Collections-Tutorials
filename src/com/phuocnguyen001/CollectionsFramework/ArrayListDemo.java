package com.phuocnguyen001.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public void arraylistClass() {
		List<String> list = new ArrayList<String>(); /* creating ArrayList */
		/*
		 * adding object in ArrayList
		 */
		list.add("audi");
		list.add("bmw");
		list.add("audi");
		list.add("mercedes");
		/*
		 * Traversing list through Iterator
		 */
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

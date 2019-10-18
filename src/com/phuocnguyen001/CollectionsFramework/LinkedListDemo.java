package com.phuocnguyen001.CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public void linkedListClass() {
		List<String> list = new LinkedList<String>();
		/*
		 * adding objects to LinkedList
		 */
		list.add("bwm");
		list.add("bently");
		list.add("audi");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

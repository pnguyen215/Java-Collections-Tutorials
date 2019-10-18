package com.phuocnguyen.WaysToTraversingElementInCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Methods {

	public void usingIteratorMethod() {

		List<String> list = new ArrayList<String>();

		// adding objects to list

		list.add("AUDI");
		list.add("BMW");
		list.add("BENTLY");
		list.add("PORSCHE");
		list.add("LAMBORGHINI");

		// traversing elements
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void usingfor_EachLoop() {
		List<String> list = new ArrayList<String>();

		// adding objects to list

		list.add("AUDI");
		list.add("BMW");
		list.add("BENTLY");
		list.add("PORSCHE");
		list.add("LAMBORGHINI");

		// traversing elements
		for (String string : list) {
			System.out.println(string);
		}
	}

	public void usingListIteratorMethod() {
		List<String> list = new ArrayList<String>();

		// adding objects to list

		list.add("AUDI");
		list.add("BMW");
		list.add("BENTLY");
		list.add("PORSCHE");
		list.add("LAMBORGHINI");

		// traversing elements
		ListIterator<String> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

	public void usingForLoopMethod() {
		List<String> list = new ArrayList<String>();

		// adding objects to list

		list.add("AUDI");
		list.add("BMW");
		list.add("BENTLY");
		list.add("PORSCHE");
		list.add("LAMBORGHINI");

		// traversing elements
		for (int i = 0; i < list.size(); i++) {
			System.out.println("value: " + list.get(i));
		}
	}

	public void usingForEachMethod() {
		List<String> list = new ArrayList<String>();

		// adding objects to list

		list.add("AUDI");
		list.add("BMW");
		list.add("BENTLY");
		list.add("PORSCHE");
		list.add("LAMBORGHINI");

		// traversing elements
		list.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});
	}

	public void usingForEachRemainingMethod() {
		List<String> list = new ArrayList<String>();

		// adding objects to list

		list.add("AUDI");
		list.add("BMW");
		list.add("BENTLY");
		list.add("PORSCHE");
		list.add("LAMBORGHINI");

		// traversing elements
		Iterator<String> iterator = list.iterator();
		iterator.forEachRemaining(ls -> {
			System.out.println(ls);
		});
	}
}

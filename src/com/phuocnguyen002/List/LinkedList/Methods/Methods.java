package com.phuocnguyen002.List.LinkedList.Methods;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;

	public void print() {
		List<String> list = new LinkedList<String>();

		/*
		 * adding object to list
		 */
		list.add("bmw");
		list.add("audi");
		list.add("bently");
		// traversing elements
		list.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});

		System.out.println(list);
	}

	public void removeMethod() {
		List<String> list = new LinkedList<String>();

		/*
		 * adding object to list
		 */
		list.add("bmw");
		list.add("audi");
		list.add("bently");
		list.add("lamborghini");
		list.add("bugati");

		// Removing specific element from ArrayList
		list.remove("bmw");
		list.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});

		System.out.println();

		// Removing element on the basis of specific position
		list.remove(0);
		list.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});

		System.out.println();

		// Removing first element from the list
		((LinkedList<String>) list).removeFirst();
		list.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});
		((LinkedList<String>) list).removeLast();

		System.out.println();

		// Removing first element from the list
		((LinkedList<String>) list).removeLast();
		list.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});

	}

	public void reverseMethod() {
		List<String> list = new LinkedList<String>();

		/*
		 * adding object to list
		 */
		list.add("bmw");
		list.add("audi");
		list.add("bently");
		list.add("lamborghini");
		list.add("bugati");
		// traversing elements
		Iterator<String> iterator = ((LinkedList<String>) list).descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

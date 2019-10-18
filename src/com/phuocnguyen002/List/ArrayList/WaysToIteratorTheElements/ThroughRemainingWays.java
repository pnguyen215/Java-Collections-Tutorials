package com.phuocnguyen002.List.ArrayList.WaysToIteratorTheElements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ThroughRemainingWays implements Serializable {

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
		System.out.println("Traversing list through List Iterator:");
		ListIterator<String> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			String output = listIterator.previous();
			System.out.println(output);
		}
		System.out.println();
		/*
		 *
		 */
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toUpperCase()); // all of elements in list is upper case
		}
		/*
		 *
		 */
		System.out.println();
		System.out.println("Traversing list through forEach() method:");
		list.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});
		/*
		 *
		 */
		System.out.println();
		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> iterator = list.iterator();
		iterator.forEachRemaining(itr -> {
			// using lambda expression
			System.out.println(itr);
		});
	}
}

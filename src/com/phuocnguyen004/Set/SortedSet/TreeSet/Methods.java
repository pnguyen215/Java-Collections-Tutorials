package com.phuocnguyen004.Set.SortedSet.TreeSet;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Methods implements Serializable {
	private static final long serialVersionUID = 1L;

	public void demo() {
		Set<String> set = new TreeSet<String>();

		// adding object to set
		set.add("fordmustang");
		set.add("bmw");
		set.add("audi");
		set.add("bently");

		// traversing object
		set.forEach(s -> { // using lambda expression
			System.out.println(s);
		});
	}

	// traversing elements in descending order
	public void descendingIteratorMethod() {
		TreeSet<String> set = new TreeSet<String>();

		// adding object to set
		set.add("fordmustang");
		set.add("bmw");
		set.add("audi");
		set.add("bently");

		System.out.println("Traversing element through Iterator in descending order");
		Iterator<String> iterator = set.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	// to retrieve and remove the highest and lowest Value
	public void getValueHighLow() {
		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(12);
		set.add(-4);
		set.add(67);
		set.add(21);

		System.out.println("Highest(min): " + set.pollFirst());
		System.out.println("Lowest(max): " + set.pollLast());
	}

	// perform various NavigableSet operations
	public void navigableSetMethod() {
		TreeSet<String> set = new TreeSet<String>();

		set.add("c");
		set.add("e");
		set.add("a");
		set.add("b");
		set.add("d");
		set.add("f");

		System.out.println("Initial set: " + set);
		System.out.println("Reverse set: " + set.descendingSet());
		System.out.println("Head set: " + set.headSet("c", true));
		System.out.println("Subset: " + set.subSet("b", false, "e", true));
		System.out.println("Tailset: " + set.tailSet("d", true));
	}

}

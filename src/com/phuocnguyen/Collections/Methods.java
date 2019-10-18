package com.phuocnguyen.Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Methods {

	public void addAllMethod() {
		Set<String> set = new HashSet<String>();

		boolean isadded = Collections.addAll(set, "audi", "bmw", "lamborghini", "bently");

		// print out
		System.out.println("boolean isadded: " + isadded);
		System.out.println("Set: ");
		set.forEach(ls -> {
			System.out.println(ls);
		});
	}

	public void asLifoQueueMethod() {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("audi"); // adding object to deque
		deque.add("bmw");
		deque.add("lamborghini");
		deque.add("bently");

		System.out.println(deque);

		Queue<String> queue = Collections.asLifoQueue(deque);
		queue.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});
	}

	public void asLifoQueueMethod2() {
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.offer(1);
		deque.offer(2);
		System.out.println("Initial view of the queue is: " + deque);
		deque.offer(3);
		System.out.println("New queue value is: " + deque);
		Queue<Integer> deque2 = Collections.asLifoQueue(deque);
		deque2.offer(4);
		deque2.offer(5);
		System.out.println("The resultant view of the queue is: " + deque2);
	}

	public void binarySearchMethod() {
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		list.add("bently"); // adding object to list
		list.add("audi");
		list.add("lamborghini");

		list2.add(43);
		list2.add(87);
		list2.add(12);
		list2.add(65);
		list2.add(98);
		Collections.sort(list2);

		list.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});

		// search
		int index = Collections.binarySearch(list, "audi");
		System.out.println("index 'audi' is available at position:" + index);

		// search by reverseOrder
		int index2 = Collections.binarySearch(list2, 12, Collections.reverseOrder());
		System.out.println("index 12 is available at position:" + index2);
	}

	public void binarySearchMethod2() {
		List<Book> list = new ArrayList<Book>();
		Book book1 = new Book("clean code", 01); // creating a lot of books
		Book book2 = new Book("design pattern", 02);
		Book book3 = new Book("solution in java", 03);
		list.add(book1); // adding book to list
		list.add(book2);
		list.add(book3);

		Collections.sort(list, new MyComparator());
		// traversing elements
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});

		// search
		int index = Collections.binarySearch(list, new Book("clean code", 01), new MyComparator());
		System.out.println("Available at index: " + index);
		index = Collections.binarySearch(list, new Book("abc", 6), new MyComparator());
		System.out.println("Available at index: " + index);
	}

	public void checkedCollectionMethod() {

		List<String> listString = new ArrayList<String>();
		List<Integer> listNumber = new ArrayList<Integer>();

		/*
		 * adding object to list
		 */

		// for listString
		listString.add("audi");
		listString.add("bmw");
		listString.add("lamborghini");

		// for listNumber
		listNumber.add(2019);
		listNumber.add(11);
		listNumber.add(9);

		/*
		 * creating type safe view of the collection
		 */
		Collection<String> subString;
		Collection<Integer> subNumber;

		subString = Collections.checkedCollection(listString, String.class);
		subNumber = Collections.checkedCollection(listNumber, Integer.class);

		// print out
		System.out.println("type safe view of string: " + subString);
		System.out.println("type safe view of integer: " + subNumber);
	}

	public void checkedListMethod() {
		List<String> listString = new ArrayList<String>();
		List<Integer> listNumber = new ArrayList<Integer>();

		/*
		 * adding object to list
		 */

		// for listString
		listString.add("audi");
		listString.add("bmw");
		listString.add("lamborghini");

		// for listNumber
		listNumber.add(2019);
		listNumber.add(11);
		listNumber.add(9);

		// print out
		System.out.println(Collections.checkedList(listString, String.class));
		System.out.println(Collections.checkedList(listNumber, Integer.class));
	}

	public void checkMapMethod() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		// adding object to map
		map.put(1, "audi");
		map.put(2, "bmw");
		map.put(3, "bently");
		map.put(4, "lamborghini");

		System.out.println("Type safe view of map: " + Collections.checkedMap(map, Integer.class, String.class));
	}

	public void checkedNavigableMapMethod() {
		NavigableMap<String, Integer> map = new TreeMap<String, Integer>();
		//
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);

		//
		System.out.println("type safe view of navigabel map: "
				+ Collections.checkedNavigableMap(map, String.class, Integer.class));
	}

	public void checkedNavigableSetMethod() {
		NavigableSet<String> subSet = new TreeSet<String>();
		// adding object to subSet
		subSet.add("audi");
		subSet.add("bmw");
		subSet.add("lamborghini");
		subSet.add("bently");
		// print out
		System.out.println("type safe view if Navigable Set: " + Collections.checkedNavigableSet(subSet, String.class));
	}
}

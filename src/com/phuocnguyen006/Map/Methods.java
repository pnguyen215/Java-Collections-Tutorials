package com.phuocnguyen006.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Methods {

	public void demo() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(001, "audi");
		map.put(003, "lamborghini");
		map.put(002, "bmw");

		map.replace(003, "porsche");

		// using keySet
		Set<Integer> key = map.keySet();
		for (Integer k : key) {
			System.out.println(k + " " + map.get(k));
		}
		System.out.println();

		map.replaceAll((k, v) -> "phuocnguyen"); // replace all name into map

		// using entrySet
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public void comparingByKeyMethod() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(001, "audi");
		map.put(003, "lamborghini");
		map.put(002, "bmw");

		/*
		 * entrySet: Returns a Set view of the mappings contained in this map; stream:
		 * Returns a sequential Stream with this collection as its source; sorted:
		 * Sorted according to the provided Comparator
		 *
		 */
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(ls -> {
			System.out.println(ls);
		});
	}

	public void comparingByKeyDescendingOrderMethod() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(001, "audi");
		map.put(003, "lamborghini");
		map.put(002, "bmw");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(ls -> {
			System.out.println(ls);
		});

	}

	public void comparingByValueMethod() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(001, "audi");
		map.put(002, "bmw");
		map.put(003, "lamborghini");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(ls -> {
			System.out.println(ls);
		});
	}

	public void comparingByValueDescendingOrderMethod() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(001, "audi");
		map.put(002, "bmw");
		map.put(003, "lamborghini");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(ls -> {
			System.out.println(ls);
		});
	}

	public void mappingObject() {
		Map<Integer, Book> map = new HashMap<Integer, Book>();

		Book book1 = new Book("bmw", 2018); // creating new book
		Book book2 = new Book("audi", 2019);
		Book book3 = new Book("lamborghini", 2020);

		map.put(1, book2); // adding book to map
		map.put(4, book1);
		map.put(3, book3);

		// traversing elements
		for (Entry<Integer, Book> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().toString());
		}
	}
}

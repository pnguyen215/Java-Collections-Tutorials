package com.phuocnguyen006.Map.TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Methods {

	public void demo() {

		Map<Integer, String> map = new TreeMap<Integer, String>();

		// adding object to map
		map.put(1, "bmw");
		map.put(3, "audi");
		map.put(4, "bently");
		map.put(5, "honda");

		// traversing elements
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	public void removeMethod() {
		Map<Integer, String> map = new TreeMap<Integer, String>();

		// adding object to map
		map.put(1, "bmw");
		map.put(3, "audi");
		map.put(4, "bently");
		map.put(5, "honda");

		// remove
		map.remove(5);
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	public void navigableMapInterface() {
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		// adding object to map
		map.put(1, "bmw");
		map.put(3, "audi");
		map.put(4, "bently");
		map.put(5, "honda");
		/*
		 * Maintains descending order
		 */
		for (Integer entry : map.descendingKeySet()) {
			System.out.println(entry);
		}
		System.out.println(map.descendingMap());
		/*
		 * Returns key-value pairs whose keys are less than or equal to the specified
		 * key.
		 */
		System.out.println("headMap: " + map.headMap(1, true));
		/*
		 * Returns key-value pairs whose keys are greater than or equal to the specified
		 * key.
		 */
		System.out.println("tailMap: " + map.tailMap(4, true));
		/*
		 * Returns key-value pairs exists in between the specified key.
		 */
		System.out.println("subMap: " + map.subMap(3, true, 4, true));
	}
}

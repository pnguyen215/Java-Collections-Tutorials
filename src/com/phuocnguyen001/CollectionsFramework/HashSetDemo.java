package com.phuocnguyen001.CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public void hashSetClass() {
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("bmw");
		hashSet.add("audi");
		hashSet.add("bently");
		hashSet.add("audi");
		/*
		 * Traversing elements
		 */
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

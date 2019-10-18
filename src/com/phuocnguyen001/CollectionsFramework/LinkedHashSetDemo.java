package com.phuocnguyen001.CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public void linkedHashSetClass() {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		//
		linkedHashSet.add("audi");
		linkedHashSet.add("bmw");
		linkedHashSet.add("bently");
		linkedHashSet.add("bmw");
		//
		Iterator<String> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

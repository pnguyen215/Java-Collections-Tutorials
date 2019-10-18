package com.phuocnguyen001.CollectionsFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public void treeSetClass() {
		TreeSet<String> treeSet = new TreeSet<String>();
		//
		treeSet.add("bmw");
		treeSet.add("audi");
		treeSet.add("bently");
		// traversing elements
		Iterator<String> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

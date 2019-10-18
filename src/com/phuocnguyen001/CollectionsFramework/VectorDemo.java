package com.phuocnguyen001.CollectionsFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public void vectorClass() {
		List<String> vector = new Vector<String>();
		/*
		 * adding objects to vector
		 */
		vector.add("bmw");
		vector.add("honda");
		vector.add("audi");

		Iterator<String> iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

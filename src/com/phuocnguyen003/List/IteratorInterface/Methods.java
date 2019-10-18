package com.phuocnguyen003.List.IteratorInterface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;

	public void listIteratorInterface() {
		List<String> list = new ArrayList<String>();
		list.add("audi");
		list.add("bmw");
		list.add("bently");

		// traversing elements
		System.out.println("Traversing elements in forward direction: ");
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("index: " + iterator.nextIndex() + " value: " + iterator.next());
		}

		System.out.println("Traversing elements in backward direction");
		while (iterator.hasPrevious()) {
			System.out.println("index: " + iterator.previousIndex() + " value: " + iterator.previous());
		}
	}
}

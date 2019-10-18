package com.phuocnguyen008.SortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Methods {

	public void sortOrginalMethod() {
		List<String> list = new ArrayList<String>();
		// adding elements to list
		list.add("audi");
		list.add("porsche");
		list.add("bmw");
		list.add("lamborghini");
		// sorting
		Collections.sort(list); // by a - z
		// traversing elements
		System.out.println("Sort by a - z: ");
		list.forEach(ls -> {
			System.out.println(ls);
		});
		// sort string object in reverse order
		System.out.println("Sort by z - a: ");
		Collections.sort(list, Collections.reverseOrder());
		list.forEach(ls -> {
			System.out.println(ls);
		});
	}

	public void sortWrapperClassObjectMethod() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(20));
		list.add(Integer.valueOf(2019));
		list.add(Integer.valueOf(11));

		// sorting
		Collections.sort(list);
		// traversing
		list.forEach(ls -> {
			System.out.println(ls);
		});
	}

	public void sortUserDefinedObjectMethod() {
		/*
		 * creating new book
		 */
		Book book1 = new Book(1, "Clean Code");
		Book book2 = new Book(3, "Algorithms in Data Mining");
		// adding book to list
		List<Book> list = new ArrayList<Book>();
		list.add(book1);
		list.add(book2);
		// traversing elements
		System.out.println("Before sorting....");
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});
		System.out.println("After sorting...");
		// sorting
		Collections.sort(list);
		// traversing elements
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});
	}

}

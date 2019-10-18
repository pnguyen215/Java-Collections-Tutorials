package com.phuocnguyen008.SortingCollections.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.phuocnguyen008.SortingCollections.Book;

public class Methods {
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

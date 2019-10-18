package com.phuocnguyen.Collections;

import java.io.Serializable;
import java.util.Comparator;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private int id;

	public Book() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Book
				? ((Book) obj).getId() == this.id && ((Book) obj).getName().equalsIgnoreCase(this.name)
				: false;
	}

}

class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		}
		return 0;
	}

}

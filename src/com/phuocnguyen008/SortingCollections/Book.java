package com.phuocnguyen008.SortingCollections;

import java.io.Serializable;

public class Book implements Serializable, Comparable<Book> {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;

	public Book() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(o.getName());
	}

}

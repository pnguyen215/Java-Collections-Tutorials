package com.phuocnguyen006.Map;

import java.io.Serializable;

public class Book implements Serializable, Comparable<Book> {

	private static final long serialVersionUID = 1L;

	private String name;
	private long year;

	public Book() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public Book(String name, long year) {
		super();
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Book o) {
		if (this.year > o.getYear()) {
			return 1;

		} else if (this.year < o.getYear()) {
			return -1;
		}
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Book
				? ((Book) obj).getName().equalsIgnoreCase(this.name) && ((Book) obj).getYear() == this.year
				: false;
	}

}

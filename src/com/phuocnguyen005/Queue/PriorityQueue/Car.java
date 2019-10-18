package com.phuocnguyen005.Queue.PriorityQueue;

import java.io.Serializable;

public class Car implements Comparable<Car>, Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private long year;

	public Car() {

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

	public Car(String name, long year) {
		super();
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Car o) {
		if (this.year > o.getYear()) {
			return 1;
		} else if (this.year < o.getYear()) {
			return -1;
		}
		return 0;
	}

}

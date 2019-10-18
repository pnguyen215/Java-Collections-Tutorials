package com.phuocnguyen004.Set.LinkedHashSet;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private long year;

	public Car() {

	}

	public Car(String name, long year) {
		super();
		this.name = name;
		this.year = year;
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

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Car ? ((Car) obj).getName().equals(this.name) && ((Car) obj).getYear() == this.year
				: false;
	}
}

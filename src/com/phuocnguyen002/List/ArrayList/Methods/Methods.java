package com.phuocnguyen002.List.ArrayList.Methods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;

	public void retainAllMethod() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		// adding object to two list
		list1.add("bmw");
		list1.add("bently");
		list2.add("bmw");
		list2.add("mercedes");
		// method retainAll
		list1.retainAll(list2); // return the same element also have on two list
		// traversing elements
		list1.forEach(ls -> {
			System.out.println(ls);
		});
	}

	public void isEmptyMethod() {
		List<String> list1 = new ArrayList<String>();
		System.out.println("Is list empty? " + list1.isEmpty());
	}

	public void setAndGetMethod() {
		List<String> list1 = new ArrayList<String>();
		list1.add("bmw");
		list1.add("bently");
		list1.add("bmw");

		System.out.println("the first element before: " + list1.get(1));
		list1.set(1, "mercedes");
		System.out.println("the first element after: " + list1.get(1));

	}

	public void removeMethod() {
		List<String> list = new ArrayList<String>();
		list.add("mercedes");
		list.remove("mercedes");
		System.out.println("Is list empty? " + list.isEmpty());
	}
}

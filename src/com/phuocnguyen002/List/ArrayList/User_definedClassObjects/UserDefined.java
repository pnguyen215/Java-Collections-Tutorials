package com.phuocnguyen002.List.ArrayList.User_definedClassObjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserDefined implements Serializable {

	private static final long serialVersionUID = 1L;

	public void method() {
		// creating new objects
		Person person = new Person("phuocnguyen", 23);
		Person person2 = new Person("DavidNguyen", 24);
		// declared ArrayList
		List<Person> list = new ArrayList<Person>();
		// adding objects to list
		list.add(person);
		list.add(person2);
		// traversing elements
		list.forEach(ls -> { // using lambda expression
			System.out.println(ls.toString());
		});
	}
}

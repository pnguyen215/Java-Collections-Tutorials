package com.phuocnguyen008.SortingCollections.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Methods {

	public void sortByObject() {
		List<Student> list = new ArrayList<Student>();

		// creating new students
		Student student1 = new Student(5, "p");
		Student student2 = new Student(2, "a");
		Student student3 = new Student(3, "e");

		// adding object to list
		list.add(student1);
		list.add(student2);
		list.add(student3);

		System.out.println("Before sort: ");
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});

		System.out.println("After sort - id: ");
		Collections.sort(list, new IdComparator());
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});

		System.out.println("After sort - name: ");
		Collections.sort(list, new NameComparator());
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});
	}

	public void sortByObjectUsingJava8() {
		List<Student> list = new ArrayList<Student>();

		// creating new students
		Student student1 = new Student(5, "b");
		Student student2 = new Student(1, "a");
		Student student3 = new Student(3, "f");

		// adding object to list
		list.add(student1);
		list.add(student2);
		list.add(student3);

		System.out.println("Before sort: ");
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});
		System.out.println("After sort - id: ");

		Comparator<Student> idComparator = Comparator.comparing(Student::getId);

		Collections.sort(list, idComparator);
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});
		System.out.println("After sort - name: ");

		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

		Collections.sort(list, nameComparator);
		list.forEach(ls -> {
			System.out.println(ls.toString());
		});
	}
}

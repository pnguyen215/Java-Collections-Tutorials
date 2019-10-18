package com.phuocnguyen004.Set.LinkedHashSet;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;
	private Scanner scanner;

	public void demo() {
		Set<String> linkedHashSet = new LinkedHashSet<String>();

		// adding object to LinkedHashSet
		linkedHashSet.add("audi");
		linkedHashSet.add("fordmutang");
		linkedHashSet.add("bmw"); // ignoring duplicate Elements
		linkedHashSet.add("bmw");
		linkedHashSet.add("bently");

		// traversing elements
		linkedHashSet.forEach(ls -> {
			System.out.println(ls);
		});
	}

	public void createObject() {
		Set<Car> linkedHashSet = new LinkedHashSet<Car>();
		scanner = new Scanner(System.in);
		String name;
		long year;

		// data
		Car car1 = new Car("bmw", 2018);
		Car car2 = new Car("lamborghini", 2019);
		Car car3 = new Car("audi", 2020);

		// adding car to hash table
		linkedHashSet.add(car1);
		linkedHashSet.add(car2);
		linkedHashSet.add(car3);

		// creating new car
		System.out.println("Enter name's car: ");
		name = scanner.nextLine();
		System.out.println("Enter year: ");
		year = scanner.nextLong();
		Car car4 = new Car(name, year);

		// traversing elements
		linkedHashSet.forEach(ls -> {
			if (car4.equals(ls)) {
				System.out.println("this is famous car " + ls);
			}
		});

	}
}

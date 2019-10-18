package com.phuocnguyen004.Set.HashSet.Methods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Spliterator;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;
	private Scanner scanner;

	public void demo() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements

		// traversing elements
		hashSet.forEach(hs -> {
			System.out.println(hs);
		});
	}

	public void hashSetFromAnotherCollection() {
		List<String> list = new ArrayList<String>();
		/*
		 * adding objects to list
		 */
		list.add("porsche");
		list.add("audi");
		list.add("bmw");
		list.add("bently");

		// adding list to hashSet
		Set<String> hashSet = new HashSet<String>(list);
		// traversing elements
		hashSet.forEach(hs -> {
			System.out.println(hs);
		});
	}

	public void addMethod() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements
		// traversing elements
		hashSet.forEach(hs -> {
			System.out.println(hs);
		});
	}

	public void clearMethod() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements
		//
		hashSet.clear();
		System.out.println(hashSet);
	}

	@SuppressWarnings("unchecked")
	public void cloneMethod() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements

		// creating new cloned set
		HashSet<String> clonedSet = new HashSet<String>();
		clonedSet = (HashSet<String>) ((HashSet<String>) hashSet).clone();
		System.out.println(clonedSet);
	}

	public void containsMethod() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements

		System.out.println(hashSet.contains("audi"));
	}

	public void isEmptyMethod() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements

		System.out.println("Is HashSet empty? " + hashSet.isEmpty());
		hashSet.clear();
		System.out.println("Is HashSet empty? " + hashSet.isEmpty());
	}

	public void iteratorMethod() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements

		// traversing elements
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void removeMethod() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements

		System.out.println("Before remove elemenet: ");
		hashSet.forEach(hs -> {
			System.out.println(hs);
		});

		hashSet.remove("audi"); // remove audi's element
		System.out.println("After remove element: ");
		hashSet.forEach(hs -> {
			System.out.println(hs);
		});
	}

	public void sizeMethod() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements

		System.out.println("Size of HashSet: " + hashSet.size());
	}

	public void spliteratorMethod() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements

		/*
		 * The spliterator() method of Java HashSet class is used to creates a
		 * late-binding and fail-fast Spliterator over the elements in this set.
		 */
		Spliterator<String> spliterator = hashSet.spliterator();
		spliterator.forEachRemaining(ls -> {
			System.out.println(ls);
		});

		// the other way to use it
		spliterator.tryAdvance(ls -> {
			System.out.println(ls);
		});
	}

	// the other way to use contains
	public HashSet<String> search() {
		Set<String> hashSet = new HashSet<String>();

		// adding object to HashSet
		hashSet.add("audi");
		hashSet.add("chevrolet");
		hashSet.add("porsche");
		hashSet.add("bmw");
		hashSet.add("mazda");
		hashSet.add("porsche"); // ignoring duplicate elements

		return (HashSet<String>) hashSet;
	}

	public void enter() {
		scanner = new Scanner(System.in);
		HashSet<String> list = search();
		String nameCar;

		System.out.print("Enter name's car, you want to search: ");
		nameCar = scanner.nextLine();
		// finding
		if (list.contains(nameCar)) {
			System.out.println(nameCar + " found on list");
		} else {
			System.out.println(nameCar + " name not on the list");
		}
	}
}

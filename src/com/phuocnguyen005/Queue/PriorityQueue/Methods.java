package com.phuocnguyen005.Queue.PriorityQueue;

import java.io.Serializable;
import java.util.PriorityQueue;
import java.util.Queue;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;

	public void demo() {
		PriorityQueue<String> queue = new PriorityQueue<String>();

		// adding object to queue
		queue.add("audi");
		queue.add("bmw");
		queue.add("fordmustang");
		queue.add("bently");

		System.out.println("Head: " + queue.peek());
		System.out.println("Head: " + queue.element());

		System.out.println("Traversing elements: ");
		queue.forEach(q -> {
			System.out.println(q);
		});

		queue.poll(); // remove
		queue.remove(); // remove

		System.out.println("After remove two elements: ");
		queue.forEach(d -> {
			System.out.println(d);
		});
	}

	// mapping object
	public void mappingObject() {
		// creating new car object
		Car car1 = new Car("bmw", 1991);
		Car car2 = new Car("ford", 1980);
		Car car3 = new Car("audi", 1999);
		Queue<Car> queue = new PriorityQueue<Car>();
		// adding list car to queue
		queue.add(car1);
		queue.add(car2);
		queue.add(car3);
		// traversing element
		queue.forEach(q -> {
			System.out.println(q.toString());
		});
	}
}

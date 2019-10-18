package com.phuocnguyen005.Queue.Deque.ArrayDeque;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Deque;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;

	public void demo() {
		Deque<String> deque = new ArrayDeque<String>();
		// adding object to dequeue
		deque.add("audi");
		deque.add("bmw");
		deque.add("bently");
		// traversing elements
		for (String run : deque) {
			System.out.println(run);
		}
	}

	public void offerFirstAndPollLastMethod() {
		Deque<String> deque = new ArrayDeque<String>();
		// adding object to dequeue
		deque.add("audi");
		deque.add("bmw");
		deque.add("bently");
		deque.add("lamborghini");
		deque.add("honda");

		deque.offerFirst("bugati");
		// traversing elements
		deque.forEach(q -> {
			System.out.println(q);
		});

		System.out.println();

		deque.pollLast(); // poll the last element
		deque.forEach(q -> {
			System.out.println(q);
		});
	}
}

package com.phuocnguyen001.CollectionsFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public void priorityQueueClass() {
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

		priorityQueue.add("audi");
		priorityQueue.add("bmw");
		priorityQueue.add("bently");
		priorityQueue.add("ferrari");
		/*
		 * get the first element
		 */
		System.out.println(priorityQueue.element()); // audi
		System.out.println(priorityQueue.peek()); // audi
		//
		System.out.println("Elements of priorityQueue: ");
		Iterator<String> iterator = priorityQueue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//
		System.out.println("Element is removed: " + priorityQueue.remove());
		System.out.println("Element is removed: " + priorityQueue.poll());
		//
		System.out.println("after removing two elements:");
		Iterator<String> iterator2 = priorityQueue.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}

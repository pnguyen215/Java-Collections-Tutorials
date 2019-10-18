package com.phuocnguyen001.CollectionsFramework;

public class Main {

	public static void main(String[] args) {
		// 1
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		arrayListDemo.arraylistClass();

		System.out.println();
		// 2
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		linkedListDemo.linkedListClass();

		System.out.println();
		// 3
		VectorDemo vectorDemo = new VectorDemo();
		vectorDemo.vectorClass();

		System.out.println();
		// 4
		StackClass stackClass = new StackClass();
		stackClass.stackClass();

		System.out.println();
		// 5
		PriorityQueueDemo priorityQueueDemo = new PriorityQueueDemo();
		priorityQueueDemo.priorityQueueClass();

		System.out.println();
		// 6
		ArrayDequeDemo arrayDequeDemo = new ArrayDequeDemo();
		arrayDequeDemo.arrayDequeClass();

		System.out.println();
		// 7
		HashSetDemo hashSetDemo = new HashSetDemo();
		hashSetDemo.hashSetClass();

		System.out.println();
		// 8
		LinkedHashSetDemo linkedHashSetDemo = new LinkedHashSetDemo();
		linkedHashSetDemo.linkedHashSetClass();

		System.out.println();
		// 9
		TreeSetDemo treeSetDemo = new TreeSetDemo();
		treeSetDemo.treeSetClass();
	}

}

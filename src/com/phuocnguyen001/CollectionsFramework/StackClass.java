package com.phuocnguyen001.CollectionsFramework;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

	public void stackClass() {
		Stack<String> stack = new Stack<String>(); // or using Vector<Sting> stack = ...

		stack.push("audi");
		stack.push("bmw");
		stack.push("mescedes");

		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

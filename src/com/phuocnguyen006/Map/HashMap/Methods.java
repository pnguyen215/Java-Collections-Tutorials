package com.phuocnguyen006.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Methods {

	public void demo() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(4, "honda");
		map.put(5, "lamborghini");
		map.put(3, "audi");
		map.put(6, "bently");
		map.put(null, "bently");
		map.put(7, null);

		// traversing elements
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("After remove: ");
		map.remove(4);
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("After replace: ");
		map.replaceAll((k, v) -> "phuocnguyen");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}

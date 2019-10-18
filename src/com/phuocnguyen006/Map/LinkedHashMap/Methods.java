package com.phuocnguyen006.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Methods {

	public void demo() {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();

		// adding object to map
		map.put(001, "bently");
		map.put(003, "bmw");
		map.put(005, "audi");

		// traversing elements
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key: " + entry.getKey() + " " + "value: " + entry.getValue());
		}

		// case 2

		Set<Integer> keySet = map.keySet();
		System.out.println("key: " + keySet);
	}

	public void mappingObjectCar() {
		Car car1 = new Car("AUDI", 2019);
		Car car2 = new Car("BMW", 2020);
		Car car3 = new Car("LAMBORGHINI", 2021);

		Map<Integer, Car> map = new LinkedHashMap<Integer, Car>();
		// adding car to map
		map.put(03, car1);
		map.put(02, car3);
		map.put(05, car2);
		// traversing
		for (Map.Entry<Integer, Car> entry : map.entrySet()) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue().toString());
		}
	}
}

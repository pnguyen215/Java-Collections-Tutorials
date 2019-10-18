package com.phuocnguyen007.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Methods {

	public void demo() {
		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();

		hash.put(01, "audi");
		hash.put(02, "bmw");
		hash.put(03, "bently");

		// traversing elements
		for (Map.Entry<Integer, String> map : hash.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
	}

	public void removeMethod() {
		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();

		hash.put(01, "audi");
		hash.put(02, "bmw");
		hash.put(03, "bently");

		// remove
		hash.remove(01);
		// traversing elements
		for (Map.Entry<Integer, String> map : hash.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
	}

	public void getOrderDefaultMethod() {
		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();

		hash.put(01, "audi");
		hash.put(02, "bmw");
		hash.put(03, "bently");

		System.out.println(hash.getOrDefault(01, "not found"));
		System.out.println(hash.getOrDefault(06, "not found"));
	}

	public void putIfAbsentMethod() {
		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();

		hash.put(01, "audi");
		hash.put(02, "bmw");
		hash.put(03, "bently");

		// traversing element
		System.out.println("Initial Map: " + hash);
		// Inserts, as the specified pair is unique
		hash.putIfAbsent(07, "lamborghini");
		System.out.println("Update: " + hash);
		hash.putIfAbsent(01, "audi");
		System.out.println("Update: " + hash);
	}
}

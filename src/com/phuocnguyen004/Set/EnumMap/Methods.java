package com.phuocnguyen004.Set.EnumMap;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	};

	public void demo() {
		EnumMap<days, String> map = new EnumMap<days, String>(days.class);
		map.put(days.MONDAY, "monday");
		map.put(days.FRIDAY, "friday");
		map.put(days.SUNDAY, "sunday");
		map.put(days.THURSDAY, "thursday");

		for (Map.Entry<days, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}

	public void clearMethod() {
		EnumMap<days, String> map = new EnumMap<days, String>(days.class);

		map.put(days.MONDAY, "monday");
		map.put(days.FRIDAY, "friday");
		map.put(days.SUNDAY, "sunday");
		map.put(days.THURSDAY, "thursday");

		System.out.println("before clear: " + map);
		// clear method
		map.clear();
		System.out.println("after clear: " + map);
	}

	public void cloneMethod() {
		EnumMap<days, String> map = new EnumMap<days, String>(days.class);
		EnumMap<days, String> map2 = new EnumMap<days, String>(days.class);

		map.put(days.MONDAY, "monday");
		map.put(days.FRIDAY, "friday");
		map.put(days.SUNDAY, "sunday");
		map.put(days.THURSDAY, "thursday");

		System.out.println("map2 before clone: " + map2);
		System.out.println("before clone of map1: " + map);

		// clone
		map2 = map.clone();
		System.out.println("after clone to map2, map2: " + map2);
	}

	public void containsKeyMethod() {
		EnumMap<days, String> map = new EnumMap<days, String>(days.class);

		map.put(days.MONDAY, "monday");
		map.put(days.FRIDAY, "friday");
		map.put(days.SUNDAY, "sunday");
		map.put(days.THURSDAY, "thursday");

		// containsKey
		boolean isContainsKey = map.containsKey(days.FRIDAY);
		System.out.println("result check key: " + isContainsKey);
	}

	public void containsValueMethod() {
		EnumMap<days, String> map = new EnumMap<days, String>(days.class);

		map.put(days.MONDAY, "monday");
		map.put(days.FRIDAY, "friday");
		map.put(days.SUNDAY, "sunday");
		map.put(days.THURSDAY, "thursday");

		// containsValue
		boolean isContainsValue = map.containsValue("monday");
		System.out.println("resutl check value: " + isContainsValue);
	}
}

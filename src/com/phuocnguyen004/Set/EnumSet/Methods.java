package com.phuocnguyen004.Set.EnumSet;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.Set;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;

	public void demo() {
		Set<days> set = EnumSet.of(days.MONDAY, days.FRIDAY);
		set.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});

		System.out.println();

		// allOf and noneOf
		Set<days> set2 = EnumSet.allOf(days.class);
		set2.forEach(ls -> { // using lambda expression
			System.out.println(ls);
		});

		System.out.println();

		Set<days> set3 = EnumSet.noneOf(days.class);
		set3.forEach(ls -> { // using lambda expression
			System.out.println(ls.name());
		});
	}
}

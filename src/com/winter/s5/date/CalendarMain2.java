package com.winter.s5.date;

import java.util.Calendar;

public class CalendarMain2 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();
		birth.set(1999, 4, 1);
		System.out.println(birth.getTime());

		long c = ca.getTimeInMillis();
		System.out.println(c);
		System.out.println(c * 1000);
		System.out.println(c * 60);
		System.out.println(c / (1000 * 60 * 60 * 24));

		long b = birth.getTimeInMillis();
		b = b + 1000 * 60 * 60 * 24 * 100L;
		birth.setTimeInMillis(b);
		System.out.println(birth.getTime());
		birth.roll(0, false)

	}

}

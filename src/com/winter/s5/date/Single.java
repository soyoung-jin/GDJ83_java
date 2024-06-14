package com.winter.s5.date;

public class Single {
	private static Single single;

	int num = 10;

	private Single() {

	}

	public static Single get() {
		if (single == null) {
			Single.single = new Single();
		}
		return single.single;
	}
}

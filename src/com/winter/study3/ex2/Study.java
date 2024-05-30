package com.winter.study3.ex2;

public class Study {

	public int[] remove(int[] ar) {
		int[] newAr = new int[ar.length - 1];
		for (int i = 0; i < newAr.length; i++) {
			newAr[i] = ar[i];
		}
		return newAr;

	}

	public int[] add(int[] ar) {
		System.out.println(ar.length);
		int[] newAr = new int[ar.length + 1];

		for (int i = 0; i < ar.length; i++) {
			newAr[i] = ar[i];
		}
		return ar;
	}
}

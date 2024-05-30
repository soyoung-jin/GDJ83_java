package com.winter.study3.ex2;

public class Ex2Main {

	public static void main(String[] args) {

		Study st = new Study();
		int[] ar = { 1, 2, 3, 4, 5, 6 };

		ar = st.add(ar);
		System.out.println(ar.length);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}

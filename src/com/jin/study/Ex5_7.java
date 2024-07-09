package com.jin.study;

public class Ex5_7 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);
	}
}

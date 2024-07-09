package com.jin.study;

public class Ex5_8 {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		int count = 0;

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = sum / count;
		System.out.println(sum);
		System.out.println(avg);
	}

}

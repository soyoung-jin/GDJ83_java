package com.jin.study.jung;

public class Ex4_5 {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 5) {
			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

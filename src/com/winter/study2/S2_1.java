package com.winter.study2;

import java.util.Scanner;

public class S2_1 {

	public static void main(String[] args) {
		int[] ar = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {
			System.out.println("입력하세요.");
			int ar1 = sc.nextInt();
			ar[i] = ar1;
		}

		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i]);
		}
//배열의 크기를 입력함
		System.out.println("배열의 크기를 입력");
		int k = sc.nextInt();
		int[] ar1 = new int[k];

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]);
		}
	}

}

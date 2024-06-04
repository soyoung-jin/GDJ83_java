package com.winter.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {
	public static void main(String[] args) {

		// 비번 길이는 최소 6글자 이상
		// 대소문자, 숫자 1개 이상이 있어야 함. isDigit();
		// 각자 검증해보시오.

		Scanner sc = new Scanner(System.in);
		System.out.println("pw를 입력");
		String pw = sc.next();
		String result = "최소 하나의 대문자가 있어야 함";

		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isUpperCase(ch)) {
				result = "통과";
				break;
			}
		}

		System.out.println(result);
	}

}

package com.winter.s1;

import java.util.Scanner;

public class S4Main {
	public static void main(String[] args) {
		String name = "Computer Science";
		String result = name.substring(3);

		// 확장자 분리
		result = name.substring(3, 5);
		System.out.println(result);
		System.out.println("파일명을 입력하세요. 확장자 포함");
		Scanner sc = new Scanner(System.in);

		name = sc.next();
		int i = name.indexOf(".");
		String result1 = name.substring(i + 1);
		System.out.println(result1);

		// jpg. jpeg, jiff, png, gif 파일명 입력시, (저 4개 중 하나이면 이미지 파일)
		// 이미지 파일이냐 아니냐를 판단하려함

		if (result1.equals("jpg") || result1.equals("png") || result1.equals("jiff") || result1.equals("jpeg")) {
			System.out.println("이미지 확장자 입니다.");
		} else {
			System.out.println("이미지 확장자가 아닙니다.");
		}
	}

}

package com.winter.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("주민 번호 입력");
		String jumin = sc.next();
		char ca = jumin.charAt(7);
		System.out.println(ca);

		// 1. 성별을 검증
		/***
		 * 2000년대 이후 출생자 3,4, 2000년대 이전 출생자 1,2,
		 */

//		switch (ca) {
//		case '1':
//			System.out.println("성별이 남자입니다.");
//		case '2':
//			System.out.println("성별이 여자입니다.");
//		case '3':
//			System.out.println("성별이 남자입니다.");
//		case '4':
//			System.out.println("성별이 여자입니다.");
//
//		}

		// 2. 나이를 계산 2024-출생년

		// 주민번호 유효성 검사
		// 각 주민번호에 2,3,4,5,6,7,8,9,2,3,4,5,--를 곱하여 더한다
		// 총합을 11로 나눈 나머지를 구하기
		// 이 나머지를 11로 뺀 결과값을 검증용 숫자와 같은지 비교
		// 11로 뺀 결과값이 2자리 수라면, 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자와 같은 지 비교

		int sum = 0;
		for (int i = 0; i < jumin.length(); i++) {
			char n1 = jumin.charAt(i);
			String n2 = String.valueOf(n1);
			int num1 = Integer.parseInt(n2);
			System.out.println(num1 * 2);
			sum = sum + (num1 * 2);

		}
		System.out.println("총합: " + sum);
	}

}

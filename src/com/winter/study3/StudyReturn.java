package com.winter.study3;

import java.util.Random;

public class StudyReturn {

	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]){}

	public void t5(Test test) {
		System.out.println(test.level);
	}

	public void t4(int sal) {
		// 프리랜서 월급 받아서 3.3% 제외한 실수령액 계산
		// 실수령액 = 월급 - 월급 * 0.033
		double result = sal - sal * 3.3;
	}

	// 리턴타입의 제한은 없음
	public int t1() {
		int num = 3;
		if (num % 2 == 0) {
			return 0;
		}
		int num2 = 6;
		int result = num * num2;

		// 리턴의 데이터갯수는 딱 하나만 가능
		return num;
	}

	public void t2() {
		Random random = new Random();
		// 0이상 10미만의 정수 하나를 랜덤하게 리턴
		int num = random.nextInt(10);
		if (num % 2 == 0) {
			return;
		} else {
			System.out.println(num);
		}
	}

}
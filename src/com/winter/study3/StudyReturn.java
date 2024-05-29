package com.winter.study3;

import java.util.Random;

public class StudyReturn {

	public int t1() {
		int num = 3;
		int num2 = 6;
		int result = num * num2;

		return result;
	}

	public void t2() {
		Random random = new Random();
		random.nextInt(10);
		// 0~9까지의 정수 랜덤으로 뽑음
	}

}

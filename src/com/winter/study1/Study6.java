package com.winter.study1;

public class Study6 {

	public static void main(String[] args) {
		int total = 256;
		int avg = total/ 3;

		// 평균이 90점 이상이면 A 등급
		// 평군이 80점 이상이면 B 등급
		// 평균이 70점 이상이면 C 등급
		// 평균이 60점 이상이면 D 등급
		// 이외는 F

		if (avg >= 0 && avg <= 100) {

			switch (avg / 10) {
			case 10:
				System.out.println("A등급");
				int n =10;
				break;
			case 9:
				System.out.println("A등급");
				break;
			case 8:
				System.out.println("B등급");
				break;
			case 7:
				System.out.println("C등급");
				break;
			case 6:
				System.out.println("D등급");
				break;
			default:
				System.out.println("F등급");
				break;
			}
		}

	}

}

package com.jin.study;

import java.util.Scanner;

public class Ex5_9 {
	public static void main(String[] args) {
		int studentNum = 0;
		int[] studentScore = null;
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		int max = 0;
		int select = 0;
		boolean flag = false;

		while (!flag) {
			System.out.println("::::::::::::::::::::::::::::::::::");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("::::::::::::::::::::::::::::::::::");
			System.out.print("번호 입력> ");
			select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				System.out.println("학생수를 입력하세요.");
				studentNum = Integer.parseInt(sc.nextLine());
				studentScore = new int[studentNum];
			} else if (select == 2) {
				for (int i = 0; i < studentScore.length; i++) {
					System.out.print("scores[" + i + "]>");
					studentScore[i] = Integer.parseInt(sc.nextLine());
				}

			} else if (select == 3) {
				for (int i = 0; i < studentScore.length; i++) {
					System.out.println("scores[" + i + "]:" + studentScore[i]);
					sum = sum + studentScore[i];

				}

			} else if (select == 4) {
				for (int i = 1; i < studentScore.length; i++) {
					if (max < studentScore[i]) {
						max = studentScore[i];
					}
				}
				System.out.println("최고 점수: " + max);
				avg = sum / studentNum;
				System.out.println("평균: " + avg);

			} else if (select == 5) {
				System.out.println("프로그램 종료");
				flag = !flag;
			} else {
				System.out.println("잘못 입력했습니다.");

			}

		}
	}

}

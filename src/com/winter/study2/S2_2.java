package com.winter.study2;

import java.util.Scanner;

public class S2_2 {

	public static void main(String[] args) {
		// 학생 수를 입력받아서 학생 수 만큼 이름과 영어, 국어점수를 입력받아서 최종 출력
		// a = 80, b = 90

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요.");
		int std = sc.nextInt();

		String[] people = new String[std];
		int[] score = new int[std];
		int[] escore = new int[std];
		int[] stdnumber = new int[std];

		System.out.println("학생들의 이름을 입력하세요.");

		for (int i = 0; i < people.length; i++) {
			people[i] = sc1.next();
		}

		for (int i = 0; i < score.length; i++) {
			System.out.println("국어 점수를 입력하세요.");
			score[i] = sc2.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			escore[i] = sc3.nextInt();
		}

		for (int i = 0; i < people.length; i++) {
			System.out.print(people[i] + ": ");
			System.out.println(escore[i] + " ");
			System.out.print(score[i] + " ");

		}

//		 1번 학생 수 입력 받는 모두가 실행 // 2. 출력은 2번 눌렀을 때 출력이 다 끝나려면 언제까지 해주어야 하는지 적어야 함.
		// 학생의 번호를 입력해서 그 학생과 일치하는 모든 정보를 출력, 그 학생 것 한줄만 나오면 됨.
		// 데이터를 하나씩 꺼내서 같은지 다른지 배열의 크기만큼 반복해야 한다.

		// 학생 정보가 입력되면 성적순으로 출력하라. --> 내림차순 정렬 먼저 정렬 예제...

//		

	}

}

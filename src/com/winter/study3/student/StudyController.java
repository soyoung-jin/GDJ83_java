package com.winter.study3.student;

import java.util.Scanner;

public class StudyController {
	public static void main(String[] args) {
		StudentService ss = new StudentService();

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("1. 학생 정보 입력, 2.전체 정보 출력, 3. 학생 검색, 4. 종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("학생 정보 입력코드 ");

			} else if (select == 2) {
				System.out.println("전체 정보 출력 ");

			} else if (select == 3) {
				System.out.println("학생 검색 ");

			} else if (select == 4) {
				System.out.println("종료");

			}
		}

	}
}

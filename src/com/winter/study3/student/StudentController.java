package com.winter.study3.student;

import java.util.Scanner;

public class StudentController {

	StudentView sv = new StudentView();

	public void start() {
		System.out.println("student");

		// 1.학생정보입력 2.전체정보출력 3.학생검색 4.종료
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		StudentService service = new StudentService();
		Student[] students = null;

		while (flag) {
			System.out.println("1.학생정보입력 2.전체정보출력 3.학생검색 4.종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("학생정보입력 코드 작성해");
				students = service.makeStudent();

			} else if (select == 2) {
				System.out.println("전체정보출력 코드 작성해");

				sv.view();

			} else if (select == 3) {
				System.out.println("학생검색 코드 작성해");
			} else if (select == 4) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못 입력");
			}
		}

	}

}
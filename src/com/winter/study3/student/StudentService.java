package com.winter.study3.student;

import java.util.Scanner;

public class StudentService {
	// findByNum 일치하는 학생의 객체를 리턴

	// makeStudent
	public Student[] makeStudent() {
		Scanner sc = new Scanner(System.in);
		// 같은 데이터타입을 묶는것

		System.out.println("학생의 수를 입력하세요");
		int count = sc.nextInt();

		// 학생들을 모을 배열을 리턴
		// Student
		// 배열
		Student[] students = new Student[count];

		for (int i = 0; i < students.length; i++) {

			// students[i]=new Student();
			Student s = new Student();
			System.out.println(i + 1 + " 번째 이름 입력");
			s.name = sc.next();
			System.out.println(s.name + "의 번호 입력");
			s.num = sc.nextInt();
			System.out.println(s.name + "의 국어 입력");
			s.kor = sc.nextInt();
			System.out.println(s.name + "의 영어 입력");
			s.eng = sc.nextInt();
			System.out.println(s.name + "의 수학 입력");
			s.math = sc.nextInt();
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;

			students[i] = s;
		}

		return students;
	}

}
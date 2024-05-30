package com.winter.study3.student;

public class StudentView {

	Student st = new Student();
	Student[] sts = null;

	public void view() {

		System.out.println("view method 실행");

		for (int i = 0; i < sts.length; i++) {
			Student st = sts[i];
			System.out.println(st.name);
			System.out.println(sts[i].avg);
		}
	}
}

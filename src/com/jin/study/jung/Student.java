package com.jin.study.jung;

class Ex6_4 {
	public static void main(String[] args) {
		Student st = new Student();
		st.name = "dd";
		st.ban = 3;
		st.no = 1;
		st.kor = 100;
		st.eng = 100;
		st.math = 88;

		System.out.println("이름: " + st.name);
		System.out.println("총점: " + st.getTotal());
		System.out.println("평균: " + st.getAverage());
	}
}

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
		return Math.round((kor + eng + math) / 3);
	}
}

package com.jin.study.jung;

public class Ex6_5 {
	public static void main(String[] args) {
		Student1 st = new Student1("홍시영", 1, 1, 100, 60, 76);
		System.out.println(st.info());
	}

}

class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math;
	}

}

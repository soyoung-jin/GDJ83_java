package com.winter.study3.student;

public class Student {
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	// 변수 선언 공식 데이터타입명 변수명=
	// 객체 생성 공식 new 클래스명()
	// 메서드 선언 공식
	// public static void main(String [] args){}
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){}
	public void info() {
		int num = 10;
		System.out.println("info 실행");
	}

}
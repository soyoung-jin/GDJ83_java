package com.winter.s1;

class Person {
	int age;
	String name;
	boolean join;
	int member;

	void print() { // 객체 정보 출력 메서드
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("클럽 참여 여부: " + join);
		System.out.println("클럽 인원: " + member);
	}

}
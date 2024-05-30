package com.winter.study2;

public class Member {

	private String name;
	private int age;

	public void setAge(int age) {
		// set은 설정하는거니까 바꿀 값 = 즉 매개변수가 있어야 함
		this.age = age;
	}

	public int getAge() {
		return this.age;
		// 매개변수 필요 없음 가져오면 되니까, 근데 가져오는 리턴타입은 맞춰줘야함
		// 나이니까 int 타입 가져옴

	}

}

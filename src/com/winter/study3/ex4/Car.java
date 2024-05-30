package com.winter.study3.ex4;

public class Car {

	String color;
	String brand;
	String company;
	int price;

	Car() {
		System.out.println("자동차가 만들어집니다.");
	}

	public void info() {
		System.out.println("info");
		System.out.println(this.color);
		System.out.println(brand);
		System.out.println(price);
	}

}

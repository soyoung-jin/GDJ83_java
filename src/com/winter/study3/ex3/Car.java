package com.winter.study3.ex3;

public class Car {

	String color;
	String brand;
	String company;

	public void info(Car car) {
		System.out.println("info");
		System.out.println(car.color);
		System.out.println(this);
		System.out.println(this.color);
	}

}

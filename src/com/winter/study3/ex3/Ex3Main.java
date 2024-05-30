package com.winter.study3.ex3;

public class Ex3Main {
	public static void main(String[] args) {

		Car car = new Car();
		car.color = "black";
		car.brand = "카니발";
		car.company = "현대";

		Car car2 = new Car();
		car.color = "blue";
		car.brand = "suv";
		car.company = "기아";

		car.info(car);
		car.info(car2);
	}

}

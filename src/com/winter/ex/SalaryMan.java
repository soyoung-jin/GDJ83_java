package com.winter.ex;

public class SalaryMan {
	int salary;

	SalaryMan() {
		this.salary = 1000000;
	}

	SalaryMan(int salary) {
		this.salary = salary;
	}

	public int getAnnualGross() {
		return (this.salary * 12) + (this.salary * 5);

	}

}

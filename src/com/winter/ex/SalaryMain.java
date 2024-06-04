package com.winter.ex;

public class SalaryMain {

	public static void main(String[] args) {

		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}

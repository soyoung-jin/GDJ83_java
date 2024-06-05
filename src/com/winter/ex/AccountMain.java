package com.winter.ex;

public class AccountMain {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(1000000);
		ac.deposit(20000);
		ac.deposit(2000000);
		ac.withdraw(20000);

		System.out.println(ac.toString());
		System.out.println(ac);

	}

}

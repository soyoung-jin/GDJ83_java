package com.winter.ex;

public class AccountMain1 {

	public static void main(String[] args) {
		Account1 account = new Account1();

		account.setBalance(100000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());

	}

}

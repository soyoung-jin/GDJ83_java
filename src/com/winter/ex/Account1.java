package com.winter.ex;

public class Account1 {

	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance < Account1.MIN_BALANCE || balance > Account1.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}

}

package com.winter.ex;

public class Account {
	private String owner;
	private long balance;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
		System.out.println(this.balance);
	}

	public long deposit(long amount) {
		this.balance = this.balance + amount;
		System.out.println(this.balance);

		return this.balance;
	}

	public long withdraw(long amount) {
		this.balance = this.balance - amount;
		System.out.println(this.balance);

		return this.balance;
	}

}

package com.jin.study;

import java.util.Scanner;

public class Ex6_20 {
	public static void main(String[] args) {

	}

}

class Account {
	private String ac_num;
	private String owner;
	private int balance;

	public Account(String ac_num, String owner, int balance) {
		this.setAc_num(ac_num);
		this.setOwner(owner);
		this.setBalance(balance);
	}

	public String getAc_num() {
		return ac_num;
	}

	public void setAc_num(String ac_num) {
		this.ac_num = ac_num;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

class BackApplication {
	private static Account[] list = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = false;
		while (!flag) {

			System.out.println(":::::::::::::::::::::::::::::::");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println(":::::::::::::::::::::::::::::::");

			System.out.print("선택>");
			int select;
			select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				createAc();

			} else if (select == 2) {
				listAc();

			} else if (select == 3) {
				depositAc();

			} else if (select == 4) {
				withdraw();

			} else if (select == 5) {
				System.out.println("프로그램 종료");
				flag = !flag;

			} else {
				System.out.println("잘못 입력하셨습니다.");

			}

		}
	}

	private static void createAc() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");

		System.out.print("계좌번호 입력>");
		String acNum = sc.nextLine();

		System.out.print("계좌주 입력>");
		String owner = sc.nextLine();

		System.out.print("초기입금액 입력>");
		int balance = Integer.parseInt(sc.nextLine());

		Account newAccount = new Account(acNum, owner, balance);

		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				list[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}

		}

	}

	private static void listAc() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.print(list[i].getAc_num() + "\t");
				System.out.print(list[i].getOwner() + "\t");
				System.out.print(list[i].getBalance() + "\t");
				System.out.println();
			} else {
				break;
			}
		}
	}

	public static void depositAc() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");

		System.out.print("계좌번호 입력>");
		String inAcNum = sc.nextLine();

		System.out.print("예금액 입력>");
		int balance = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				if (list[i].getAc_num().equals(inAcNum)) {
					int input = list[i].getBalance();
					input = input + balance;
					list[i].setBalance(input);
				}
			}
		}
	}

	public static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");

		System.out.print("계좌번호 입력>");
		String inAcNum = sc.nextLine();

		System.out.print("출금액 입력>");
		int balance = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				if (list[i].getAc_num().equals(inAcNum)) {
					int input = list[i].getBalance();
					input = input - balance;
					list[i].setBalance(input);
				}
			}
		}

	}
}

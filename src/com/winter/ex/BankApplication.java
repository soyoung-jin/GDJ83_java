package com.winter.ex;

import java.util.Scanner;

public class BankApplication {

	Account[] ac = new Account[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("1. 계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("--------------------------------");

		System.out.print("선택: ");
		int select = sc.nextInt();
		System.out.println("-------------");
		switch (select) {
		case 1:
			System.out.println("계좌생성");
			break;
		case 2:
			System.out.println("계좌목록");
			break;
		case 3:
			System.out.println("예금");
			break;
		case 4:
			System.out.println("출금");
			break;
		case 5:
			System.out.println("종료");
			System.exit(0);
			break;
		}
		System.out.println("-------------");

	}

}

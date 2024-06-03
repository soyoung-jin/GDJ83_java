package com.winter.s1;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		// 게터세터로 가져와서 입력받기
		Order od = new Order();
		Scanner sc = new Scanner(System.in);

		System.out.println("주문번호 입력: ");
		od.setOrderNum(sc.nextLine());

		System.out.println("주문자 아이디 입력: ");
		od.setId(sc.nextLine());

		System.out.println("주문 날짜 입력: ");
		od.setOrderDate(sc.nextLine());

		System.out.println("주문자 이름 입력: ");
		od.setName(sc.nextLine());

		System.out.println("주문 상품 번호 입력: ");
		od.setStockNum(sc.nextLine());

		System.out.println("배송 주소 입력: ");
		od.setAddress(sc.nextLine());

		od.print();

		// String indexOf() 호출

	}

}

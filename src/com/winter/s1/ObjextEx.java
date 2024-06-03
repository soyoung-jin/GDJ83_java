package com.winter.s1;

import java.util.Scanner;

public class ObjextEx {
	public static void main(String[] args) {

		// 같은 패키지내에 있는 클래스들을 사용할 때 import 생략 가능
		// java.lang내의 클래스들을 사용할 때 import 생략 가능

		Object obj = new Object();

		String s = new String();
		s = "soyeong";
		obj = (Object) s.charAt(3);
		System.out.println(s);
		System.out.println(obj);

		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요.");

		String n = sc.next();

		System.out.println(n.length() * 1000 + "입니다.");

	}

}

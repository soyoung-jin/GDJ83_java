package com.winter.study1;

import com.winter.study2.Korea;
import com.winter.study2.Member;

public class S1Main {
	public static void main(String[] args) {
		Test1 test = new Test1();
//		test.num = 3;

		Member m = new Member();

		Korea k = new Korea();
		k.setPop(20);
		String c = k.getCapital();
		System.out.println(c);
	}

}

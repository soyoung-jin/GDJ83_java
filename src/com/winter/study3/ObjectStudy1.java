package com.winter.study3;

public class ObjectStudy1 {

	public static void main(String[] args) {
		StudyReturn sr = new StudyReturn();
		// int result = sr.t2();
		int n = sr.t1();
		int sal = 50000000;

		Test t = new Test();

		t.level = 100;
		t = new Test();
		t.level = 500;
		sr.t5(t);
//
//		sr.t4(sal);

//		// 학생 객체 생성
//		// new 클래스명() -> 객체의 주소가 반환
//		Student s = new Student();
//		s.num = 2;
//		s.name = "iu";
//
//		System.out.println(s);
//		System.out.println(s.name);
//		System.out.println(s.kor);
//
//		Student s2 = new Student();
//		System.out.println(s2.name);
//
//		Student s3 = null;
//		s3 = s;
//		System.out.println(s3.name);
//		s3.name = "winter";
//		System.out.println(s.name);
//
//		Student s4 = new Student();
//		s4.num = s.num;
//		s4.name = s.name;
//		System.out.println(s4.name);
//		s4.name = "hani";
//		System.out.println(s.name);
//
//		// 멤버메서드 호출
//		// 참조변수명.멤버메서드명();
//		// 멤버변수 사용
//		// 참조변수명.멤버변수명
//		s.info();
//		s.info();

	}

}
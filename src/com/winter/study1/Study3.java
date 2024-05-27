package com.winter.study1;

public class Study3 {

	public static void main(String[] args) {
//		1. 물건 고른다, 물건의 총 합계가 나온다, 돈을 내고 결재한다.
//		물건의 총 합계를 구하고, 돈을 지불 후, 거스름돈이 얼마인지?
		
		//물건을 고르고, 물건의 총합계, 돈을 내고
		int total = 35224;
		int don =50000;
				
		//잔돈 계산
		int jandon = don - total;
				
				
		//만원 개수를 담을 변수
		
		int man = 0;
		man = total/10000;
		
		
		System.out.println("잔돈" + jandon);
		System.out.println("만원" + man + "장");
		
		//거스름돈 각 자리당 개수
		//1번 방법
//		int chon =(jandon - man*10000)/1000;
//		int baek =(jandon - man*10000-chon*1000)/1000;
		
		//2번 방법
	
		int chon = jandon%10000/1000;
		int baek = jandon%1000/100;
		
		
	
		
	

	}

}

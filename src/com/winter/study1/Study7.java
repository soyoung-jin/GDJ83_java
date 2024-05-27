package com.winter.study1;
import java.util.Scanner;

public class Study7 {

	public static void main(String[] args) {
		for(int i=0; i <5; i++) {
			System.out.print(i);
			
		}
		
		//3과목의 점수를 입력받아 합계 구하기
		int total =0;
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < 3; i++) {
			int score = sc.nextInt();
			total += score;
		}
		System.out.println(total);

		
		//'a' -> z 출력
		
		
		for(int i= 97; i < 97+26; i++) {
			System.out.print((char)i);
		}
		
		for(int i= 'a'; i < 'z'; i++) {
			System.out.print((char)i);
		}
	}
	

}

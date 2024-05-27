package com.winter.study1;
import java.util.*; 

public class Study8 {
	public static void main(String[] args) {
		//이중 for문
		
		//FPS(배그, 서든, 베필)
		//총알(30발, 탄창 3개)
		//점사, 단발
		
		//1. 단발로 2. 점사로
		//1번이면 한번 탕 ,총 30번 2번이면 타타탕, ,총 10번 탕탕소리 남
		//탄창 다 쓰면 다시 물어봄 1번할거야 2번할거야
		//
		
		
		System.out.println(":::: 게임을 시작합니다. ::::");
		Scanner sc = new Scanner(System.in);
		int shoot = 3;
		
		while(shoot>0) {
			System.out.println("번호를 선택하세요.");
			System.out.println("1.단발, 2.점사");
			int pick = sc.nextInt();
			if(pick == 1) {
				for(int i =0; i<30; i++) {
					System.out.print("탕! ");
				}
				System.out.println();
				System.out.println("탄창이 비워졌습니다.");
				shoot--;
				continue;
			}
			
			if(pick == 2) {
				for(int i =0; i<10; i++) {
					System.out.print("타타탕! ");
				}
				System.out.println();
				System.out.println("탄창이 비워졌습니다.");
				shoot--;
				continue;
			}
		}
		System.out.println(":::: 게임을 종료합니다. ::::");
		
		
	}
}

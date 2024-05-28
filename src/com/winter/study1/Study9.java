package com.winter.study1;
import java.util.*;

public class Study9 {

	public static void main(String[] args) {
		//로그인 검증
		//id는 1234 pw = 5678
//		로그인 시도 전에 1. 로그인, 2. 종료
//		사용자의 id와 pw를 입력받아서 로그인 시도를 n번
		//틀리면 로그인 실패 출력, 로그인 성공하면 성공 출력하고 반복문 종료
		
		//반복문 종료 후 중료를 선택했다면 프로그램이 종료
		//로그인 성공 후 반복문이 종료되었다면 게임을 시작하자.
		
		//MMORPG:
		//시작 레벨은 1, 최대 레벨 10
		
		//아이템 GOLD: 0 으로 시작
		//1레벨 -> 2레벨로 가려면 3마리 잡기 ((레벨 업 하기 전에 사냥할거냐 게임 종료할거냐 물어보기)
		//2-> 3 갈때는 6마리
		//3--> 4 갈때는 9마리
		//14 --> 15 가려면 42마리 잡아야 함
		//
		//몬스터의 경험치는 모두 다 동일한 가정 하)
		//사냥을 완료했다는 것을 출력하고 레벨업 해야 함
		
		//레벨업 할 때 축하금으로 5레벨 달성 시 1000골드 지급
		//10레벨 달성 시 2000골드 지급
		//15레벨 달성 시 3000골드 지급
		
		//1~15 레벨업 끝나면 마지막에 프로그램 종료, 종료 전 현재 레벨과 현재 골드를 출력.
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String id = "1234";
		String pw = "5678";
		String myid = "";
		String mypw = "";
		int pick = 0;
		int gold =0;
		int level =1;
		
		
		
		boolean flag = false;
		boolean flag1 = false;
		
		while(!flag) {
			
			System.out.println("::: 숫자를 선택하시오. 1.로그인, 2.프로그램 종료 ::: ");
			pick = sc.nextInt();
			if(pick == 1) {
				System.out.println("::: 1. 로그인 선택 ::: ");
				System.out.println("::: 로그인 ::: ");
				System.out.println("::: 아이디 입력 ::: ");
				myid = sc1.nextLine();
				
				System.out.println("::: 패스워드 입력 ::: ");
				mypw = sc1.nextLine();
				
				if(myid.equals(id)&& mypw.equals(pw)) {
					System.out.println("::: 로그인 성공 ::: ");
					while(!flag1) { //여기서 break 하면 이 while 문만 빠져나오게 됨.
						System.out.println("::: 게임을 시작합니다. ::: ");
						
						//1레벨 -> 2레벨로 가려면 3마리 잡기 ((레벨 업 하기 전에 사냥할거냐 게임 종료할거냐 물어보기)
						//2-> 3 갈때는 6마리
						//3--> 4 갈때는 9마리
						//14 --> 15 가려면 42마리 잡아야 함
						
						System.out.println("::: MMORPG GAME START! ::: ");
						while(level<15) {
							int monster = level*3;
							
							System.out.println("::: 현재 레벨 " + level + " :::");
							System.out.println();
							System.out.println(">>>몬스터 사냥 시작<<<");
							while(monster>0) {
								System.out.print("맞아랏!(die) ");
								monster--;
							}
							System.out.println();
							System.out.println();
							System.out.println("축!! 몬스터 처치 완료!!");
							level++;
							System.out.println("::: 레벨업 " + level + " :::");
							
							for(int i =1; i < 4; i++) {
								if(level == (5 * i)) {
									gold = gold + (1000*i);
									System.out.println("레벨업 축하금 " + (1000* i) + "골드 지급~");
								}
							}
						
						}
						System.out.println("::: 현재 레벨: " + level + ", 현재 골드: " + gold + " :::");
						System.out.println("::: 만렙 달성, 프로그램을 종료합니다. :::");
						break;
					}
					
				} else {
					System.out.println("::: 아이디 혹은 비밀번호가 잘못되었습니다. ::: ");
					continue;
				}
				
			} else if(pick == 2) {
				System.out.println("::: 2. 종료 선택 ::: ");
				System.out.println("::: 프로그램을 종료합니다. ::: ");
				break;
				
			} else {
				System.out.println("::: 1, 2 중에 입력하세요. ::: ");
			}
			flag = !flag;
		}
	
		
		
	
		
		
		

	}

}

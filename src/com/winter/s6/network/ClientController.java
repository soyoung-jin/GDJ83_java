package com.winter.s6.network;

import java.util.Scanner;

public class ClientController {

	private ClientConnect clientConnect;

	public ClientController() throws Exception {
		clientConnect = new ClientConnect();
		// 어차피 한번만 쓰니까 여따 선언해도 ㅇㅋ
		clientConnect.getConnection();
		ClientService ss = new ClientService();

	}

	public void start() throws Exception {
		// 접속을 하고 1,2,3번 나옴

		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("1번: 전체 2번: 상세 3번: 종료");
			int select = sc.nextInt();

			if (select == 1) {
				clientConnect.getOw().write(select + "\r\n");
				clientConnect.getOw().flush();

				String info = clientConnect.getBr().readLine();
				// 파싱 과정을 메서드로 만들어서 부르면 됨.
//				clientService.getInfo(info);

			} else if (select == 2) {

			} else {

			}
		}
	}

}

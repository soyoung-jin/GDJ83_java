package com.winter.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain2 {
	public static void main(String[] args) {
		// 프로그램 실행 기다리고 있다가 접속하면 번호를 하나 받음
		// 1번이 오면 학생 정보를 print로 보내줌
		// 2번 오면 그중에서 학생 한명의 정보를 하나의 문자열로 보내줌
		// 3번이 오면 종료
		// 2번에서 어느 학생을 뽑을 것인지, 학생의 번호를 가져와야함(데이터도 꺼내 와야함)
		// 데이터를 어떻게 파싱할것인지를 정해야 함

		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;

		Scanner scanner = new Scanner(System.in);
		try {
			ss = new ServerSocket(8282);

			while (true) {
				// 서버를 열고 Client 접속을 기다림
				System.out.println("서버실행 후 클라이언트를 기다림");
				sc = ss.accept();
				System.out.println("client와 연결 성공");

				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);

				while (true) {
					String msg = br.readLine();
					if (msg.toUpperCase().equals("EXIT")) {
						break;
					}
					System.out.println(msg);

					System.out.println("클라이언트로 보낼거 입력");
					msg = scanner.next();

					ow.write(msg + "\r\n");
					ow.flush();

					if (msg.toUpperCase().equals("EXIT")) {
						break;
					}

				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				os.close();
				ow.close();
				sc.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

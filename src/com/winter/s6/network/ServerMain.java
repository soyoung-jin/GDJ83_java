package com.winter.s6.network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
	public static void main(String[] args) {
		// 프로그램 실행 기다리고 있다가 접속하면 번호를 하나 받음
		// 1번이 오면 학생 정보를 print로 보내줌
		// 2번 오면 그중에서 학생 한명의 정보를 하나의 문자열로 보내줌
		// 3번이 오면 종료
		// 2번에서 어느 학생을 뽑을 것인지, 학생의 번호를 가져와야함(데이터도 꺼내 와야함)
		// 데이터를 어떻게 파싱할것인지를 정해야 함
		/*
		 * 1. 연결 2. Stream연결 3. Data 주고받기 a) 파일 읽어서 전송 전에 하나의 문자열로 만들기 b) 받은 문자열을 파싱하는
		 * 기능 4. 콘솔에 출력
		 * 
		 */

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
				System.out.println("서버 실행 후 클라이언트를 기다림");
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
					StringBuffer sb = new StringBuffer();
					String s = "";

					if (msg.equals("1")) {
						s = ServerMain.dataSend();

					}

					ow.write(s + "\r\n");
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

	public static String dataSend() throws Exception {
		File file = new File("C:\\Study\\studentServer.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		boolean flag = true;
		String s = "";
		while (flag) {

			String v = br.readLine();
			System.out.println(s);

			if (v == null) {
				flag = false;
			} else if (v.isEmpty()) {
				continue;
			}
			s = s + "-" + v;
		}
		s = s.substring(1);

		br.close();
		fr.close();

		return s;

	}
}

package com.winter.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);
		try {

			socket = new Socket("127.0.0.1", 8282);
			System.out.println("서버와 연결 성공");

			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);

			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			while (true) {
				System.out.println("서버로 보낼 메세지 입력");
				String str = sc.next();

				ow.write(str + "\r\n");
				ow.flush();

				if (str.toUpperCase().equals("EXIT")) {
					break;
				}

				str = br.readLine();

				if (str.toUpperCase().equals("EXIT")) {
					break;
				}

				System.out.println(str);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ow.close();
				os.close();
				is.close();
				ir.close();
				br.close();
				socket.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
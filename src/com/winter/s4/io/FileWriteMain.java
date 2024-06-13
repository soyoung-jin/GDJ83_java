package com.winter.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {
		// 문자열 -> 문자 -> 01

		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요.");
		String fileName = sc.next();
		boolean flag = false;
		File file = new File("C:\\Study", fileName);
		FileWriter fw = null; // try 안에 쓰면 지역변수로 close를 할 수 없기 때문에 밖으로 변수를 선언해준 것.

		try {
			fw = new FileWriter(file, true); // append가 true로 정의되면 기존에 있던 내용에 덧붙이게 된다.
			// 같은 파일명이 있으면 덮어씌우게 된다. //\n을 쓰면 한줄 띄워서 append된다.

			while (!flag) {

				System.out.println("입력하시오.");
				String s = sc.next();

				if (s.toLowerCase().equals("e")) {
					break;
				}
				// e나 E가 입력되면 종료
				fw.write(s + "\r\n");
				fw.flush(); // 버퍼를 강제로 비우라는 메서드, 한번씩 꼭 써줘야 돌아감
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 역순으로 자원을 닫아준다.
		}
		System.out.println("종료");
	}

}

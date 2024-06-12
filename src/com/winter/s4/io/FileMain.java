package com.winter.s4.io;

import java.io.File;

public class FileMain {
	// bit(byte) - 문자 - 문자열
	// 파일 정보를 담고 있는 객체
	public static void main(String[] args) {
		File file = new File("C:\\Study");

		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println();

//		file = new File("C:\\study","test.text");
		file = new File(file, "sub");

		file.mkdir();

		File[] e = file.listFiles();

	}
}

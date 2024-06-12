package com.winter.s4.io;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// bit(byte) -> 문자 -> 문자열
		// 파일정보를 담고 있는 객체

		File file = new File("C:\\study");

		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.length());

		System.out.println("====================");
		// file = new File("C:\\study", "test.txt");
		file = new File(file, "sub");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

		if (!file.exists()) {
			file.mkdir();
		}

		file = new File("C:\\study\\sub2\\student");

		file.mkdirs();

		file = new File("C:\\study\\test.txt");
		file.delete();

		file = new File("C:\\study\\sub2");
		file.delete();

		file = new File("C:\\study");

		String[] list = file.list();

		for (String s : list) {
			System.out.println(s);
		}

		File[] ar = file.listFiles();
		for (File f : ar) {
			if (f.isDirectory()) {
				System.out.println("폴더");
			}

			if (f.isFile()) {
				System.out.println("파일");
			}
		}

	}

}
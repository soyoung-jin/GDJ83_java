package com.jin.study.jung;

public class Ex9_3 {
	public static void main(String[] args) {
		String fullpath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";

		path = fullpath.substring(0, 14);
		System.out.println(path);
		fileName = fullpath.substring(15, 36);
		System.out.println(fileName);
	}

}

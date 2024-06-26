package com.winter.s7.thread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNumber pn = new PrintNumber();
		PrintWord pw = new PrintWord();

		Thread thread = new Thread(pw);
		// thread만 start를 가직 있음

		pn.start();
		thread.start();
	}

}

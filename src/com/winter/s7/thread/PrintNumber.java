package com.winter.s7.thread;

public class PrintNumber extends Thread {

	@Override
	public void run() {
		this.info();
	}

	public synchronized/* 한사람만 할 수 있다는 단어 */ void info() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1초 재움
		}
	}

}

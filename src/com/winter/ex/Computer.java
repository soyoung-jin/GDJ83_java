package com.winter.ex;

public class Computer {

	public String[] osType = { "윈도우7", "애플 OS X", "안드로이드" };

	public int memory;
	private int os;

	Computer(int os, int memory) {
		this.os = os;
		this.memory = memory;
	}

	public void print() {
		System.out.printf("운영체제: %s, 메인메모리: %d%n", osType[os], memory);

	}

}

package com.winter.s2.util.collections.ex2;

import java.util.Scanner;

public class IdService {

	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);

	public IdService() {
		this.sb = new StringBuffer();
		this.sb.append("홍시영, 01011112222, hong@gamil.com, 11104,");
		this.sb.append("변우석, 01011113333, woo@gamil.com, 10729,");
		this.sb.append("권지용, 01011114444, kwon@gamil.com, 80818");

	}

}

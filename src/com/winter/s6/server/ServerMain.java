package com.winter.s6.server;

public class ServerMain {
	public static void main(String[] args) {
		ServerConnect sc = new ServerConnect();
		try {
			sc.getConnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

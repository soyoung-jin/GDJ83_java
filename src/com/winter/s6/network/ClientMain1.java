package com.winter.s6.network;

public class ClientMain1 {
	public static void main(String[] args) {
		/*
		 * 
		 */

		ClientConnect cc = new ClientConnect();
		ClientService cs = new ClientService();
		try {
//			cc.getConnection();
			String info = "1,if,60,winter,if,40";
			cs.getInfo(info);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

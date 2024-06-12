package com.winter.s4.io.ex1;

import java.util.List;

public class Ex1Main {

	public static void main(String[] args) {
		ReadStudy rs = new ReadStudy();
		try {
			List<MenuDTO> list = rs.read();
			for (MenuDTO menuDTO : list) {
				System.out.println(menuDTO.getMenuName());
				System.out.println(menuDTO.getPrice());
				System.out.println("=================");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

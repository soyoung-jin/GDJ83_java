package com.winter.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadStudy {

	public List<MenuDTO> read() throws Exception {
		// info.txt 파일 읽어오기
		// 1. 읽어서 파싱 후 DTO들을 만든 후에 리턴

		File file = new File("C:\\study", "info.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		ArrayList<MenuDTO> list = new ArrayList<MenuDTO>();

		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}

			MenuDTO menuDTO = new MenuDTO();
			// 1. split
			String[] ar = s.split(","); // 라면 3500 500
			menuDTO.setMenuName(ar[0].trim());
			menuDTO.setPrice(Integer.parseInt(ar[1].trim()));
			menuDTO.setKcal(Integer.parseInt(ar[2].trim()));

			// 2. StringTokenizer
			StringTokenizer st = new StringTokenizer(s, ",");
			while (st.hasMoreTokens()) {
				menuDTO.setMenuName(st.nextToken().trim());// 라면
				menuDTO.setPrice(Integer.parseInt(st.nextToken().trim()));// 3500
				menuDTO.setKcal(Integer.parseInt(st.nextToken().trim()));// 500
			}

			list.add(menuDTO);
			System.out.println(s);
		}

		br.close();
		fr.close();

		return list;

	}

}
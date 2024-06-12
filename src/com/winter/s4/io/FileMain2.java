package com.winter.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileMain2 {
	// study2 폴더 삭제
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Study", "info.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String s = br.readLine();
			try {
				s = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (s == null) {
				break;
			}
			System.out.println(s);
		}
	}
}

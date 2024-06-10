package com.winter.s2.util.collections.ex3;

import java.util.ArrayList;

public class Collection2 {
	public void useList(ArrayList<Integer> ar) {
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		for (Integer n : ar) {
			System.out.println(n);
		}
	}

}

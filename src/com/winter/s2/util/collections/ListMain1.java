package com.winter.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		String name = "winter";
		ar.add(name);

		LinkedList lk = new LinkedList();
		lk.add("add");
		lk.remove();
		System.out.println(lk);

	}

}

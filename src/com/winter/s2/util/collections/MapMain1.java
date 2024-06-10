package com.winter.s2.util.collections;

import java.util.HashMap;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("k1", 1);
		map.put("k2", 2);

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsValue(1));

	}

}

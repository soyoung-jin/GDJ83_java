package com.winter.s2.util.collections;

import java.util.HashSet;

import com.winter.s2.util.collections.ex.ProductDTO;

public class SetMain {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		hs.add("first");
		System.out.println(hs);

		HashSet<ProductDTO> hs2 = new HashSet<ProductDTO>();

		ProductDTO pdto = new ProductDTO();
		ProductDTO pdto2 = new ProductDTO();

		hs2.add(pdto);
		hs2.add(pdto2);

		System.out.println(pdto);

		// 중복을 안하고 싶으면 set으로 사용해야 한다.

	}

}

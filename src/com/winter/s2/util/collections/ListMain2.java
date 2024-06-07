package com.winter.s2.util.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListMain2 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("first");
		ar.add(2);
		ar.add('c');
		ar.add(true);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		String name = (String) ar.get(0); // 에러 뜸
		/*
		 * /debug note:: 배열은 같은 타입만을 모은다. ar.get(0)은 Object타입인데, Object타입은 모든 타입이 가능하다는
		 * 의미로, String만 되는 것이 아니니까 그래서 제너릭을 사용하여 타입을 지정해준다. ArrayList<String> ar = new
		 * ArrayList<String>(); 이렇게 String 타입을 지정해주면, ArrayList에 담길 값은 이제 String밖에 안된다는
		 * 뜻
		 * 
		 */

		Set<String> set = new HashSet<String>();

		set.add("java");
		set.add("java1");
		set.add("java2");
		set.add("java3");

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) { // 배열에 저장된 값을 하나씩 뽑아내기 위함
			String element = iterator.next();
			System.out.println(element);
			if (element.equals("java")) {
				iterator.remove();
			}
		}
		System.out.println();

		set.remove("java1");

		System.out.println(set); // 배열의 형태로 다 나옴

	}

}

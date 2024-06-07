package com.winter.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		// main 실행 클래스

		ProductService pc = new ProductService();

		// 메서드 호출해서 ArrayList ar 리턴받은 걸 넣을 변수를 왼쪽에 선언해줘야함!!
		ArrayList<ProductDTO> ar = pc.init();

		for (int i = 0; i < ar.size(); i++) {
//			System.out.println(ar.get(i)); // productDTO의 주소만 나옴
			// 그니까 productDTO가 가진 get메서드를 호출해서 값을 불러와야 함
			System.out.println(ar.get(i).getPrice());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getStock());

		}

		pc.addProduct(ar);
		for (int i = 0; i < ar.size(); i++) {
//			System.out.println(ar.get(i)); // productDTO의 주소만 나옴
			// 그니까 productDTO가 가진 get메서드를 호출해서 값을 불러와야 함
			System.out.println(ar.get(i).getPrice());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getStock());

		}

		int result = pc.removeProduct(ar);

		// 이렇게 return을 성공, 실패로 받으면 for문 안돌려도 확인 가능
		if (result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

//		for (int i = 0; i < ar.size(); i++) {
////			System.out.println(ar.get(i)); // productDTO의 주소만 나옴
//			// 그니까 productDTO가 가진 get메서드를 호출해서 값을 불러와야 함
//			System.out.println(ar.get(i).getPrice());
//			System.out.println(ar.get(i).getName());
//			System.out.println(ar.get(i).getStock());
//
//		}

	}

}

package com.winter.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {

	// 각 제품의 정보를 담을 클래스

	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);

	public ProductService() {
		this.sb = new StringBuffer(); // StringBuffer 객체 먼저 생성
		this.sb.append("50000, 아이폰, 50,");
		this.sb.append("45000, 갤럭시, 100,");
		this.sb.append("30000, 노키아, 20");

	}

	// init
	// 각 제품 정보를 파싱한다. ArrayList에 만들어서 집어넣고 리턴하자.
	// 세개가 모여서 하나의 DTO를 만드니까 tokenizer를 이용해서 값을 잘라준다.

	public ArrayList<ProductDTO> init() {
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();
		String info = sb.toString(); // Stringbuffer인 sb를 String으로 만들어줌

		System.out.println(info);
		StringTokenizer st = new StringTokenizer(info, ","); // 구분자 ","를 기준으로 값을 자름

		while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken().trim());// 확인
			ProductDTO productdto = new ProductDTO();// DTO 객체 생성

			productdto.setPrice(Integer.parseInt(st.nextToken().trim()));
			productdto.setName(st.nextToken().trim());
			productdto.setStock(Integer.parseInt(st.nextToken().trim()));

			ar.add(productdto);

			/*
			 * NUMBERFORMATEXCEPION발생 :: 주의할 점, tokenizer append할 때 그 다음줄에 써주는거 쉽표 쓰는거
			 * 잊지말기!! this.sb.append("50000, 아이폰, 50"); -->50, 이렇게 써줘야 함!!
			 * this.sb.append("45000, 갤럭시, 100"); -> 100, 이렇게 써줘야 나눠짐!! 아니면 504500이 됨..
			 * this.sb.append("30000, 노키아, 20")
			 */
		}

		return ar;

	}

	/*
	 * 기존 가방에 새상품을 추가하려함(weatherDTO를 추가하는 것과 다름 없으나 지금은 ArrayList를 추가하는 것
	 * 
	 * 
	 */

	public void addProduct(ArrayList<ProductDTO> ar) {
		// 새로 상품을 만드니까 new ProductDTO 객체 생성
		// 상품의 가격, 이름, 재고를 입력받아서 기존의 가방에다가 추가한다.
		// 기존의 가방을 받아와서 거기에 추가해야함
		// --> addProdict의 매개변수로 기존 가방 ProductDTO가 담긴 ArrayList ar를 받음

		ProductDTO productdto = new ProductDTO();
		System.out.println("추가할 상품 가격을 입력하세요.");
		productdto.setPrice(sc.nextInt());

		System.out.println("추가할 상품명을 입력하세요.");
		productdto.setName(sc.next());

		System.out.println("추가할 재고 수를 입력하세요.");
		productdto.setStock(sc.nextInt());

		ar.add(productdto);

	}

	/*
	 * 기존의 가방을 받아서 제품을 삭제하려고 함 remove(index 번호) 일치하는 물건명을 입력받아서 해당 물건명을 삭제
	 * 
	 */

	public int removeProduct(ArrayList<ProductDTO> ar) {
		ProductDTO productdto = new ProductDTO();
		System.out.println("삭제할 상품명을 입력하세요.");
		String name = sc.next();

		int result = 0;

		for (int i = 0; i < ar.size(); i++) {
//			System.out.println(ar.get(i)); // productDTO의 주소만 나옴
			// 그니까 productDTO가 가진 get메서드를 호출해서 값을 불러와야 함

			if (name.equals(ar.get(i).getName())) {
				ar.remove(i); // remove에 리턴값은 DTO이기 때문에 삭제실패하면 null나옴

				result = 1;
			}
		}
		return result;

	}
}

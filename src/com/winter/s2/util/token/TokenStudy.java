package com.winter.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String names = "winter, IU, siyoung, wooseok";

		StringTokenizer st = new StringTokenizer(names, ","); // 뭘 기준으로 분리하려고 하는지를 두번째 인자값으로 넣으면 됨
		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) { // 문자열의 끝을 만날 때 까지 반복함
			String name = st.nextToken();
			System.out.println(name.trim());
		}

		// 하나하나 독립된 것이면 split이 편하겠지만, 데이터들이 한번에 모여있을 땐 StringTokenizer가 편리함

	}

}

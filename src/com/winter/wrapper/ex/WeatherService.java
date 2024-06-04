package com.winter.wrapper.ex;

public class WeatherService {
	// Business Layer
	// DAO Database Access Object - 영속계층
	// Controller Layer
	private StringBuffer sb;
	private String[] sb1;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-경기 , 16.3 - 태풍 - 80");
		this.sb.append("-부산 , 33.3 - 흐림 - 90");
		this.sb.append("-제주 , 26.3 - 눈 - 30");
	}

	public void init() {
		// sb에 있는 것을 문자열 변수에 담아서 출력
		String ss = sb.toString();
		System.out.println(ss);
		sb1 = ss.split("-");

		for (int i = 0; i < sb1.length; i++) {
			System.out.println(sb1[i]);
		}

		WeatherDTO wd = new WeatherDTO();
		wd.setCity(sb1[0]);
		wd.setGion(Double.parseDouble(sb1[1]));
		wd.setStatus(sb1[2]);
		wd.setHumidity(Integer.parseInt(sb1[3]));
		
		System.out.println(sb1.length);

	}

}

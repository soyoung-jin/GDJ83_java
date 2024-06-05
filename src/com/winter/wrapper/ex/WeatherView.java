package com.winter.wrapper.ex;

public class WeatherView {

	public void view(WeatherDTO weatherDTO) {

		if (weatherDTO != null) {

			System.out.println(weatherDTO.getCity());
			System.out.println(weatherDTO.getGion());
			System.out.println("===================");
		} else {
			System.out.println("날씨정보가 없다");
		}
	}

	// view
	// 날씨들의 정보를 받아서 이쁘게 출력
	public void view(WeatherDTO[] dtos) {

		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i].getCity());
			System.out.println(dtos[i].getGion());
			System.out.println("===================");
		}

	}

}
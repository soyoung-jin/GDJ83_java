package com.winter.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) {
		// DTO(data transfer Object: 데이터를 담고 있는 객체)
		// VO(value object)

		WeatherService ws = new WeatherService();
		ws.init();

	}

}

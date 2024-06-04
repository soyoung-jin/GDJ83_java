package com.winter.wrapper.ex;

public class WeatherDTO {

	// DTO의 모든 멤버변수는 private으로 설정한다.
	// 외부에서 접근이 불가하다. getter setter가 필요하다.
	// 생성자는 여러개 만들어도 상관없지만, 무조건 기본생성자는 필수
	//

	// 도시명
	private String city;
	// 온도
	private double gion;
	// 날씨
	private String status;
	//
	private int humidity;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}

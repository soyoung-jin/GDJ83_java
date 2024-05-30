package com.winter.study2;

public class Korea {
	private int pop;
	private String name;
	private String song;
	private String flower;
	private String capital;

	// source메뉴에 generate getter setter 누르면 한번에 추가 가능
	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	// 변수 하나 당 게터 세터 각 한개씩 총 두개 만들어야 함
	// 너무 많음

}

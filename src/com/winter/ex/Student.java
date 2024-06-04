package com.winter.ex;

public class Student {
	private String depart;
	private int stunum;

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
		System.out.println(depart);
	}

	public int getStunum() {
		return stunum;
	}

	public void setStunum(int stunum) {
		this.stunum = stunum;
		System.out.println(stunum);
	}

}

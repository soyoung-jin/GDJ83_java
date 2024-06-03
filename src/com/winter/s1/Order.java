package com.winter.s1;

public class Order {

	private String orderNum;
	private String id;
	private String orderDate;
	private String name;
	private String stockNum;
	private String address;

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStockNum() {
		return stockNum;
	}

	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	void print() {
		System.out.println("주문번호: " + orderNum);
		System.out.println("주문자 아이디: " + id);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자 이름: " + name);
		System.out.println("주문 상품 번호: " + stockNum);
		System.out.println("배송 주소: " + address);
	}

}

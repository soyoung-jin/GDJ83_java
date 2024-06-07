package com.winter.s2.util.collections.ex;

public class ProductDTO {

	// 제품의 정보를 담는 클래스

	private Integer price;// reference타입이니까 null이 들어가있음
	private String name;
	private Integer stock;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}

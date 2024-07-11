package com.jin.study.jung;

public class Ex7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();

	}

}

class Buyer {
	int money = 10000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {

		if (p.price > money) {
			System.out.println("잔고 부족");
			return;
		} else {
			money = money - p.price;
			add(p);
		}
	}

	void add(Product p) {
		if (i >= cart.length) {
			Product[] pp = new Product[cart.length * 2];
			System.arraycopy(cart, 0, pp, 0, cart.length);
			cart = pp;
		}
		cart[i++] = p;

	}

	void summary() {
		String list = "";
		int sum = 0;
		for (i = 0; i < cart.length; i++) {
			list = list + cart[i] + ",";
			sum = sum + cart[i].price;
			System.out.println("구매내역:" + list);
			System.out.println("구매금액:" + sum);
			System.out.println("남은 금액:" + money);

		}

	}
}

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

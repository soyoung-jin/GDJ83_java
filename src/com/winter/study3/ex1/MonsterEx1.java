package com.winter.study3.ex1;

public class MonsterEx1 {
	public static void main(String[] args) {

		Monster mon = new Monster();

		mon.hp = 100;
		mon.level = 5;
		mon.kind = "creature";
		mon.exp = 1000;
		mon.name = "hurk";

		System.out.println(mon.hp);
		System.out.println(mon.level);
		System.out.println(mon.kind);
		System.out.println(mon.exp);
		System.out.println(mon.name);

		Monster m2 = new Monster();

	}
}

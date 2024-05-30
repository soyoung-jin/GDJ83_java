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

		Tool axe = new Tool();
		axe.name = "이빠진도끼";
		axe.damage = 10;
		axe.range = 1;
//		axe.durability = 100;
//		axe.upgrade = 0;

		mon.axe = axe;

		System.out.println(mon.axe.name);

		axe = new Tool();
		axe.name = "이빠진도끼";
		System.out.println(mon.axe.name);

		Monster mon2 = new Monster();
		mon.axe = axe;

	}
}

package com.winter.study3.ex1;

public class ExMain {

	public static void main(String[] args) {
		Monster monster = new Monster();
		monster.name = "철수";
		monster.level = 10;
		monster.exp = 500;
		monster.hp = 100;
		monster.species = "오크";

		Axe axe = new Axe();
		axe.name = "이빠진도끼";
		axe.damage = 10;
		axe.range = 1;
		axe.durability = 100;
		axe.upgrade = 0;

		monster.axe = axe;

		System.out.println(monster.axe.name);

		axe = new Axe();
		axe.name = "이빠진도끼";

		System.out.println(monster.axe.name);

		Monster m2 = new Monster();
		m2.axe = axe;

	}

}
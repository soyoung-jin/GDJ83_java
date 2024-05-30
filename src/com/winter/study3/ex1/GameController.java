package com.winter.study3.ex1;

public class GameController {

	public void start() {
		// 몬스터 생성 1마리, 3마리
		MonsterFactory mf = new MonsterFactory();
		Monster m = mf.createMonster();
		System.out.println(m.name);
		System.out.println(m.level);

		Monster[] monsters = mf.createMonsterGroup();

		for (int i = 0; i < monsters.length; i++) {
			System.out.println("=======================");
			System.out.println(monsters[i].name);
			System.out.println(monsters[i].level);
		}
	}

}
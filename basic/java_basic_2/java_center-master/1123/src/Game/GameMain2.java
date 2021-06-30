package Game;

import java.util.Scanner;

public class GameMain2 {

	public static void main(String[] args) {

		GameDummy gm = new GameDummy();
		gm.makeRandom();// 난수 생성
		gm.getQuizMsg();// 문제 출제
		gm.checkAnswer(1);// 문제 판별

		PlusGame pg = new PlusGame();
		pg.makeRandom();
		System.out.println(pg.getQuizMsg());
		Scanner sc = new Scanner(System.in);
		pg.checkAnswer(sc.nextInt());

	}

}

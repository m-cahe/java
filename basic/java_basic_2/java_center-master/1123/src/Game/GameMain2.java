package Game;

import java.util.Scanner;

public class GameMain2 {

	public static void main(String[] args) {

		GameDummy gm = new GameDummy();
		gm.makeRandom();// ���� ����
		gm.getQuizMsg();// ���� ����
		gm.checkAnswer(1);// ���� �Ǻ�

		PlusGame pg = new PlusGame();
		pg.makeRandom();
		System.out.println(pg.getQuizMsg());
		Scanner sc = new Scanner(System.in);
		pg.checkAnswer(sc.nextInt());

	}

}

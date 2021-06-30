package Game;

import java.util.Scanner;

public class GameMain3_teacher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PlusGame p1 = new PlusGame();
//		      GameDummy p1 = new GameDummy();
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			p1.makeRandom();

			for (int j = 0; j < 3; j++) {
				System.out.print(i + 1 + "번 문제 >> " + p1.getQuizMsg());
				if (p1.checkAnswer(sc.nextInt())) {
					System.out.println("정답입니다.");
					cnt++;
					break;
				} else {
					if (2 - j != 0) {
						System.out.println("오답입니다. 남은 정답 기회 : " + (2 - j) + "번");
					} else {
						if (i != 4) {
							System.out.println("오답입니다. 다음 문제로 넘어갑니다.");
						} else {
							System.out.println("오답입니다.");
						}
					}
				}
			}

		}
		System.out.println("수고하셨습니다. 정답 개수 : " + cnt);

	}

}
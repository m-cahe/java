package Game;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		PlusGame pg = new PlusGame();

		Scanner sc = new Scanner(System.in);

		int t = 2;// 오류 횟수 2--하는식으로
		int count = 0;
		for (int i = 1; i <= 5; i++) {

			System.out.printf("%d번 문제 >> ", i);
			pg.makeRandom();
			System.out.print(pg.getQuizMsg());
			int answer = sc.nextInt();
			if (pg.checkAnswer(answer)) {
				System.out.println("정답입니다.");
				if (i == 5) {
					System.out.printf("수고하셨습니다. 정답 개수 : %d", 5 - count);
				}
			} else {
				System.out.println("오답입니다.");
				i--;
				System.out.printf("남은 정답 기회 : %d번\n", t);
				t--;
				if (t == -1) {
					System.out.println("다음 문제로 넘어갑니다.");

					i++;
					count++;
					t = 2;
				}
				if (i == 5) {
					System.out.printf("수고하셨습니다. 정답 개수 : %d", 5 - count);
				}
			}

		}
	}

}

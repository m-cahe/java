package StudentScorepack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		studentScore[] score = new studentScore[3];
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번째 학생의 이름을 입력하세요. >>", i + 1);
			String name = sc.next();
			System.out.printf("%d번째 학생의 Java 점수를 입력하세요. >>", i + 1);
			int scoreJava = sc.nextInt();
			System.out.printf("%d번째 학생의 Web 점수를 입력하세요. >>", i + 1);
			int scoreWeb = sc.nextInt();
			System.out.printf("%d번째 학생의 Android 점수를 입력하세요. >>", i + 1);
			int scoreAndroid = sc.nextInt();
			System.out.println();
			score[i] = new studentScore(name, scoreJava, scoreWeb, scoreAndroid);
		}
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s님의 총점은 %d점, 평균은 %.1f점입니다.\n", score[i].getName(), score[i].sum(), score[i].avg());
		}

	}
}

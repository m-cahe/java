package StudentScorepack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		studentScore[] score = new studentScore[3];
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d��° �л��� �̸��� �Է��ϼ���. >>", i + 1);
			String name = sc.next();
			System.out.printf("%d��° �л��� Java ������ �Է��ϼ���. >>", i + 1);
			int scoreJava = sc.nextInt();
			System.out.printf("%d��° �л��� Web ������ �Է��ϼ���. >>", i + 1);
			int scoreWeb = sc.nextInt();
			System.out.printf("%d��° �л��� Android ������ �Է��ϼ���. >>", i + 1);
			int scoreAndroid = sc.nextInt();
			System.out.println();
			score[i] = new studentScore(name, scoreJava, scoreWeb, scoreAndroid);
		}
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s���� ������ %d��, ����� %.1f���Դϴ�.\n", score[i].getName(), score[i].sum(), score[i].avg());
		}

	}
}

package Game;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		PlusGame pg = new PlusGame();

		Scanner sc = new Scanner(System.in);

		int t = 2;// ���� Ƚ�� 2--�ϴ½�����
		int count = 0;
		for (int i = 1; i <= 5; i++) {

			System.out.printf("%d�� ���� >> ", i);
			pg.makeRandom();
			System.out.print(pg.getQuizMsg());
			int answer = sc.nextInt();
			if (pg.checkAnswer(answer)) {
				System.out.println("�����Դϴ�.");
				if (i == 5) {
					System.out.printf("�����ϼ̽��ϴ�. ���� ���� : %d", 5 - count);
				}
			} else {
				System.out.println("�����Դϴ�.");
				i--;
				System.out.printf("���� ���� ��ȸ : %d��\n", t);
				t--;
				if (t == -1) {
					System.out.println("���� ������ �Ѿ�ϴ�.");

					i++;
					count++;
					t = 2;
				}
				if (i == 5) {
					System.out.printf("�����ϼ̽��ϴ�. ���� ���� : %d", 5 - count);
				}
			}

		}
	}

}

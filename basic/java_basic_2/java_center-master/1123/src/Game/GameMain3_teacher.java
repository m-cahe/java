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
				System.out.print(i + 1 + "�� ���� >> " + p1.getQuizMsg());
				if (p1.checkAnswer(sc.nextInt())) {
					System.out.println("�����Դϴ�.");
					cnt++;
					break;
				} else {
					if (2 - j != 0) {
						System.out.println("�����Դϴ�. ���� ���� ��ȸ : " + (2 - j) + "��");
					} else {
						if (i != 4) {
							System.out.println("�����Դϴ�. ���� ������ �Ѿ�ϴ�.");
						} else {
							System.out.println("�����Դϴ�.");
						}
					}
				}
			}

		}
		System.out.println("�����ϼ̽��ϴ�. ���� ���� : " + cnt);

	}

}
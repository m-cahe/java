package packagemusic;

import java.util.ArrayList;
import java.util.Scanner;

public class musicPlayer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList();

		list.add("������");
		list.add("HowYouLikeThat");
		list.add("��");
		list.add("��¦������");

		while (true) {
			System.out.print("[1]�뷡��ȸ [2]�뷡�߰� [3]�뷡���� [4]���� >>");
			int menu = scanner.nextInt();
			if (menu == 1) {
				playList(list);
			} else if (menu == 2) {
				playList(list);

				// �뷡 �߰�
				System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰� >> ");
				int menu1 = scanner.nextInt();
				if (menu1 == 1) {
					System.out.print("�߰��� �뷡 �Է� >> ");
					list.add(scanner.next());
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
				} else if (menu1 == 2) {
					System.out.print("�߰��� �뷡 �Է� >> ");
					String music = scanner.next();
					System.out.print("�߰��� ��ġ �Է� >> ");
					list.add(scanner.nextInt() - 1, music);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
				}

			} else if (menu == 3) {
//�뷡 ����
				playList(list);
				System.out.print("[1]���� ���� [2] ��ä ����");
				int menu1 = scanner.nextInt();
				if (menu1 == 1) {
					System.out.print("������ �뷡 ����");
					list.remove(scanner.nextInt() - 1);
					System.out.println("�뷡�� �����Ǿ����ϴ�.");
				} else if (menu1 == 2) {
					list.clear();
					System.out.println("��ü �뷡�� �����Ǿ����ϴ�.");
				}

			} else if (menu == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		}
	}

	public static void playList(ArrayList<String> list) {
		// �뷡 ��ȸ
		System.out.println("�������������������� ��� ��Ϧ���������������");

		if (list.size() == 0) {
			System.out.println("��� ����� �����ϴ�.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d. %s\n", i + 1, list.get(i));
			}
		}
		System.out.println("����������������������������������������������������");
	}
}

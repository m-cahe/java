import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("user1 �̸� �Է� : ");
		String user1 = scanner.next();
		System.out.print("user2 �̸� �Է� : ");
		String user2 = scanner.next();
		String answer = "";
		do {

			System.out.printf("%s�� ����, ����, �� �߿� �ϳ��� �Է��ϼ���. ", user1);
			String user1_pick = scanner.next();
			System.out.printf("%s�� ����, ����, �� �߿� �ϳ��� �Է��ϼ���. ", user2);
			String user2_pick = scanner.next();

			if (user1_pick.equals("����")) {
				// ��ø�����ҰŰ���
				if (user2_pick.equals("����")) {
					System.out.println("�����ϴ�!!");
				} else if (user2_pick.equals("����")) {
					System.out.printf("%s���� ���׿�!!", user1);
				} else if (user2_pick.equals("��")) {
					System.out.printf("%s���� �̰���!!", user1);
				}
			}
			if (user1_pick.equals("����")) {
				if (user2_pick.equals("����")) {
					System.out.println("�����ϴ�!!");
				} else if (user2_pick.equals("��")) {
					System.out.printf("%s���� ���׿�!!", user1);
				} else if (user2_pick.equals("����")) {
					System.out.printf("%s���� �̰���!!", user1);
				}
			}
			if (user1_pick.equals("��")) {
				if (user2_pick.equals("��")) {
					System.out.println("�����ϴ�!!");
				} else if (user2_pick.equals("����")) {
					System.out.printf("%s���� �̰���!!", user1);
				} else if (user2_pick.equals("����")) {
					System.out.printf("%s���� ���׿�!!", user1);
				}
			}

			System.out.print("\n����Ͻðڽ��ϱ�? (Y/N) ");
			answer = scanner.next();
			if (answer.equals("N")) {
				break;
			} else if (!answer.equals("N") && !answer.equals("Y")) {
				System.out.println("�������� ���մϴ�.");
				break;
			}

		} while (answer.equals("Y"));
		System.out.println("���������� ���α׷��� �����մϴ�.");
	}

}

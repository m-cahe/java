import java.util.Scanner;

public class ex_05_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String id = "";
		String answer = "";
		int pw = 0;
		System.out.print("=====start===== ");
		do {
			System.out.print("\n���̵� �Է��ϼ��� >>");
			id = scanner.next();
			System.out.print("��й�ȣ�� �Է��ϼ��� >>");
			pw = scanner.nextInt();
			if (id.equals("Hello") && pw == 1234) {
				System.out.println("�α��� ����!");
				break;
			}
			System.out.print("���̵�� ��й�ȣ�� �߸��Ǿ����ϴ�.\n");
			System.out.print("����Ͻðڽ��ϱ�? (Y/N) ");
			answer = scanner.next();
			if (answer.equals("N")) {
				break;
			} else if (!answer.equals("N") && !answer.equals("Y")) {
				System.out.println("�������� ���մϴ�.");
				break;
			}

		} while (answer.equals("Y"));

		System.out.println("\n����Ǿ����ϴ�.");
		System.out.print("=====finish===== ");
	}

}

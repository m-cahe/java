import java.util.Scanner;

public class ex_07_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("user1 �̸� �Է� : ");
		String user1 = scanner.next();
		System.out.print("user2 �̸� �Է� : ");
		String user2 = scanner.next();
		String answer = "";
		int i=0;
		int j=0;
		String [] arr= {"����", "����","��"};
		do {
			i=(int)(Math.random()*3);
			j=(int)(Math.random()*3);
			System.out.printf("%s�� %s �׿�!!\n", user1, arr[i]);
			System.out.printf("%s�� %s �׿�!!\n", user2, arr[j]);
			if (arr[i].equals(arr[0])) {
				// ��ø�����ҰŰ���
				if (arr[j].equals(arr[0])) {
					System.out.println("�����ϴ�!!");
				} else if (arr[j].equals(arr[1])) {
					System.out.printf("%s���� ���׿�!!", user1);
				} else if (arr[j].equals(arr[2])) {
					System.out.printf("%s���� �̰���!!", user1);
				}
			}
			if (arr[i].equals(arr[1])) {
				if (arr[j].equals(arr[1])) {
					System.out.println("�����ϴ�!!");
				} else if (arr[j].equals(arr[2])) {
					System.out.printf("%s���� ���׿�!!", user1);
				} else if (arr[j].equals(arr[0])) {
					System.out.printf("%s���� �̰���!!", user1);
				}
			}
			if (arr[i].equals(arr[2])) {
				if (arr[j].equals(arr[2])) {
					System.out.println("�����ϴ�!!");
				} else if (arr[j].equals(arr[1])) {
					System.out.printf("%s���� �̰���!!", user1);
				} else if (arr[j].equals(arr[0])) {
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

import java.util.Scanner;

public class ex_09_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ��� >> ");
		int amount = scanner.nextInt();
		System.out.println("�޴��� ������");
		System.out.print("1.�ݶ�(800��) 2.����(500��) 3.��Ÿ�ο���(1500��)>> ");
		int num = scanner.nextInt();
// ���� ���� �ȿ��� ����Ҽ��ִ� '��������' 
		int smallChange = 0;
		/* smallChange������ �� �޴��� ���� ���� �ܵ��� �����ϰ��ִ�.
		 * �� �޴����� �۾��� �����ϴ� �ܵ� ��� ����� �ߺ��۾��̹Ƿ�
		 * switch�� �������� �������� �ѹ��� �۾��ϱ�!! 
		 * */
		switch (num) {
		case 1:
			if (amount >= 800) {
				smallChange = amount - 800;
				System.out.printf("�ܵ� : %d", smallChange);
			}
			else {
				smallChange=amount;
				System.out.printf("�ܵ��� �����մϴ�.");
				System.out.printf("\n�ܵ� : %d", smallChange);
			}
			break;
		case 2:
			if (amount >= 500) {
				smallChange = amount - 500;
				System.out.printf("�ܵ� : %d", smallChange);
			}
			else {
				smallChange=amount;
				System.out.printf("�ܵ��� �����մϴ�.");
				System.out.printf("\n�ܵ� : %d", smallChange);
			}
			break;
		case 3:
			if (amount >= 1500) {
				smallChange = amount - 1500;
				System.out.printf("�ܵ� : %d", smallChange);
			}
			else {
				smallChange=amount;
				System.out.printf("�ܵ��� �����մϴ�.");
				System.out.printf("\n�ܵ� : %d", smallChange);
			}
			break;

		}
		
		
		int thousandDigits = smallChange / 1000;
		smallChange -= thousandDigits * 1000;
		int fivehundredDigits = smallChange / 500;
		smallChange -= fivehundredDigits * 500;
		int hundredDigits = smallChange / 100;
		smallChange -= hundredDigits * 100;
		System.out.printf("\nõ�� : %d��, ����� : %d��, ��� : %d��", thousandDigits, fivehundredDigits, hundredDigits);
	}

}

import java.util.Scanner;

public class ex_09 {

	public static void main(String[] args) {
//���Ǳ� �ܵ�����
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ��� >> ");
		int amount = scanner.nextInt();
		System.out.println("�޴��� ������");
		System.out.print("1.�ݶ�(800��) 2.����(500��) 3.��Ÿ�ο���(1500��)>> ");
		int num = scanner.nextInt();
		int smallChange = 0;
		if (num == 1 && amount >= 800) {
			smallChange = amount - 800;
			System.out.printf("�ܵ� : %d", smallChange);
		} else if (num == 2 && amount >= 500) {
			smallChange = amount - 500;
			System.out.printf("�ܵ� : %d", smallChange);
		} else if (num == 3 && amount >= 1500) {
			smallChange = amount - 1500;
			System.out.printf("�ܵ� : %d", smallChange);
		} else {
			System.out.print("���� �����ϰų� �߸��� ��ȣ�׿� �Ф�");
			System.out.printf("\n�ܵ� : %d", amount);
			smallChange = amount;
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

package animal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//��ĳ����
		while (true) {
			System.out.println("------���� ��ɹ�-------");
			System.out.print("[1]���� [2]������ [3]���� [4]���� >> ");
			int menu = scanner.nextInt();
			WildAnimal animal = null;
			switch (menu) {
			case 1:
				animal = new Lion();
				break;
			case 2:
				animal = new Eagle();
				break;
			case 3:
				animal = new Wolf();
				break;
			case 4:
				System.out.println("����Ǿ����ϴ�.");
				break;
			default:
				animal = new WildAnimal();
			}
			if (menu == 4) {
				break;
			}
			animal.hunt();

		}

	}
}

package animal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//업캐스팅
		while (true) {
			System.out.println("------동물 사냥법-------");
			System.out.print("[1]사자 [2]독수리 [3]늑대 [4]종료 >> ");
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
				System.out.println("종료되었습니다.");
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

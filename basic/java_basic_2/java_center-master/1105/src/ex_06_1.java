import java.util.Scanner;

public class ex_06_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String answer = "";
		System.out.print("=====start===== ");
		do {
			int[] array = new int[2];
			System.out.print("\n첫 번째 정수를 입력하세요 : ");
			array[0] = scanner.nextInt();
			System.out.print("두 번째 정수를 입력하세요 : ");
			array[1] = scanner.nextInt();
			System.out.print("[1]더하기 [2]빼기 >> ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("더하기 연산 결과는 " + (array[0] + array[1]));
			} else if (choice == 2) {
				System.out.println("빼기 연산 결과는 " + (array[0] - array[1]));
			}
			// \n을 어디에???
			System.out.print("계속하시겠습니까? (Y/N) ");
			answer = scanner.next();
			if (answer.equals("N")) {
				break;
			} else if (!answer.equals("N") && !answer.equals("Y")) {
				System.out.println("이해하지 못합니다.");
				break;
			}

		} while (answer.equals("Y"));

		System.out.println("\n종료되었습니다.");
		System.out.print("=====finish===== ");

	}

}

import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int evenNum = 0;
		int oddNum = 0;
		while (i != -1) {
			System.out.print("숫자 입력 : ");
			i = scanner.nextInt();
			if (i == -1) {
				break;
			}
			if (i % 2 == 0) {
				++evenNum;
				System.out.printf("짝수 개수 : %d", evenNum);
				System.out.printf("\n홀수 개수 : %d\n", oddNum);
			} else {
				++oddNum;
				System.out.printf("짝수 개수 : %d", evenNum);
				System.out.printf("\n홀수 개수 : %d\n", oddNum);
			}

		}
		System.out.print("종료되었습니다.");

	}

}

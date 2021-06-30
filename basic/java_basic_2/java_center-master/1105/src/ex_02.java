import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		while (i != -1) {
			System.out.print("숫자 입력 : ");
			i = scanner.nextInt();
			if (i == -1) {
				break;
			}
			sum += i;
			System.out.printf("누적 결과 : %d\n", sum);
		}
		System.out.println("종료되었습니다.");

	}

}

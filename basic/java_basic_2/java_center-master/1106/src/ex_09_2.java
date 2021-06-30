import java.util.Scanner;

public class ex_09_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("단수 입력 : ");
		int dan = scanner.nextInt();
		System.out.print("어느 수까지 입력 : ");
		int num = scanner.nextInt();
		int i = 0;
		int result = 0;
		System.out.printf("%d단\n", dan);
		for (i = 1; i <= num; i++) {
			result = num * i;
			System.out.printf("%d*%d=%d\n", dan, i, result);
		}

	}

}

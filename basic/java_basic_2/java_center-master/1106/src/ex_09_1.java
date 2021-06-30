import java.util.Scanner;

public class ex_09_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("╢э ют╥б : ");
		int num = scanner.nextInt();
		int j = 0;
		int result = 0;
		for (j = 1; j <= 9; j++) {
			result = num * j;
			System.out.printf("%d*%d=%d\n", num, j, result);
		}

	}

}

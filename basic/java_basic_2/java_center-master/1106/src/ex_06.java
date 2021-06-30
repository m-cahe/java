import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int i = scanner.nextInt();
		int j = 0;
		int[] arr = new int[i];
		for (j = 0; j < arr.length; j++) {
			arr[j] = j + 1;
			System.out.printf("%d ", arr[j]);
		}

	}

}

import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {

		// 1. 4칸짜리 정수형 배열
		// 2. Scanner 통해 4번 입력 받아 배열 저장
		// 3. 베열의 값이 홀수일때만 출력

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 정수 입력 : ", i + 1);
			arr[i] = scanner.nextInt();
		}
		System.out.print("배열에 들어 있는 홀수는 ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.printf("%d ", arr[i]);
			}
		}

	}

}

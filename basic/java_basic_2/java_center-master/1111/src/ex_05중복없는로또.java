import java.util.Arrays;

public class ex_05중복없는로또 {

	public static void main(String[] args) {

		int[] arr = new int[6];

		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요...!!두구두구두구!!!");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		//배열값 한번에 출력
	}

}

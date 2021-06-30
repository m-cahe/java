
public class ex_10_3 {

	public static void main(String[] args) {

		int[] arr = new int[29];// 2~30까지 수 배열

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 2;
			System.out.printf("%d의 약수 : ", arr[i]);
			int[] numarr = new int[arr[i]];// 1에서 위에서 지정한수까지 배열
			for (int j = 0; j < numarr.length; j++) {
				numarr[j] = j + 1;
				if (arr[i] % numarr[j] == 0) {
					System.out.printf("%d ", numarr[j]);
				}
				if (j == numarr.length - 1) {
					System.out.print("\n");
				}
			}

		}

	}

}

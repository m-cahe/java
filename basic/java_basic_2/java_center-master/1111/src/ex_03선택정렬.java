
public class ex_03선택정렬 {

	public static void main(String[] args) {

		int[] arr = { 44, 98, 2, 5, 17 };
		// 오름차순 정렬 진행->가장 큰값이 가장 오른쪽;4번인덱스로 가야한다.
		// 가장 큰값 갖는 인덱스 번호 찾기
		int maxIndex = 0;
		int temp = 0;
		for (int j =4; j > 0; j--) {

			for (int i = 0; i <=j; i++) {
				if (arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}

			}
			temp = arr[j];
			arr[j] = arr[maxIndex];
			arr[maxIndex] = temp;
			
		}
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

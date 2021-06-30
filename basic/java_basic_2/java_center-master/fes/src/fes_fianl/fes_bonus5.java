package fes_fianl;

public class fes_bonus5 {

	public static void main(String[] args) {

		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int Merge[] = mergeArray(A, B);

		System.out.printf("Merge : ");
		for (int i = 0; i < Merge.length; i++) {
			System.out.printf("%d ", Merge[i]);

		}

	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {

		int[] mergeArray = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			mergeArray[i] = arr1[i];
			mergeArray[arr1.length + i] = arr2[i];
		}
		int temp = 0;
		for (int i = 0; i < mergeArray.length; i++) {
			for (int j = 0; j < mergeArray.length; j++) {
				if (mergeArray[i] < mergeArray[j]) {
					temp = mergeArray[j];
					mergeArray[j] = mergeArray[i];
					mergeArray[i] = temp;

				}

			}
		}

		return mergeArray;

	}

}
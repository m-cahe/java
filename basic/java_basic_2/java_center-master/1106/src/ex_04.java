
public class ex_04 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int[] arr1 = new int[7];
		int i = 0;
		int j = 0;

		for (i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

			for (j = 0; j < arr1.length; j++) {
				if (arr[i] % 3 != 0) {
					arr1[j] = arr[i];
					System.out.printf("%d ",arr1[j]);
					break;
				}
			}

		}
		
		
		
		
		
		

	}

}

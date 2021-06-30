
public class ex_01_2 {

	public static void main(String[] args) {
		
		int[] arr = new int[19];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (2 * j-1) + 22;
			j++;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}

}

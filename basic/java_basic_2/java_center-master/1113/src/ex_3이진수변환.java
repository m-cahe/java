
public class ex_3이진수변환 {

	public static void main(String[] args) {

		String str = "01001101";
		System.out.println(str + "(2)" + " = " + binarDec(str) + "(10)");
	}

	public static int binarDec(String a) {
		String[] arr = a.split("");
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(arr[i]);
		}
		int result = 0;
		for (int i = 0; i < arr1.length; i++) {
			result += arr1[i] * powerN(2, arr1.length - 1 - i);
		}
		return result;
	}

	public static int powerN(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}
}
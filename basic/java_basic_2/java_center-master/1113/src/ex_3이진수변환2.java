
public class ex_3��������ȯ2 {

	public static void main(String[] args) {
//2���� 10���� ��ȯ ���α׷� ����
		String str = "01001101";
		System.out.println(str + "(2)" + " = " + binarDec(str) + "(10)");
	}

	public static int binarDec(String a) {
		String[] temp = a.split("");
		int[] arr = new int[temp.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i] * powerN(2, arr.length - 1 - i);
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
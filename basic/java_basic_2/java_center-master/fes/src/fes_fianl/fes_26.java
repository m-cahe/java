package fes_fianl;

public class fes_26 {

	public static void main(String[] args) {

		char[] result = casesar("L d z", 1);

		System.out.println(result);

	}

	public static char[] casesar(String A, int n) {
		String[] temp = A.split(" ");
		char[] arr1 = new char[temp.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (char) (temp[i].charAt(0) + n);
			if (temp[i].charAt(0) == 'z') {
				arr1[i] = (char) ('a' + (n - 1));
			}
		}

		return arr1;
	}
}

package fes_fianl;

public class fes_bonus2 {

	public static void main(String[] args) {

		System.out.println(getMiddle("banana"));
		System.out.println(getMiddle("apple"));
	}

	public static String getMiddle(String a) {

		String[] arr = a.split("");
		int index = 0;
		if (arr.length % 2 != 0) {
			index = (arr.length - 1) / 2;
			return arr[index];
		} else {
			index = (arr.length - 1) / 2;
			return arr[index] + arr[index + 1];
		}

	}

}

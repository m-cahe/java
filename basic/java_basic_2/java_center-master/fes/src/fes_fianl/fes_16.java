package fes_fianl;

public class fes_16 {

	public static void main(String[] args) {

		// ���ڿ� �Է¹޾� ���ĺ�������� �����ϴ� �޼ҵ�
		System.out.println(reverseStr("aVbcDBe"));

	}

	public static char[] reverseStr(String a) {
		char[] arr = new char[a.length()];
		char temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.charAt(i);
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		char[] result=arr;
		return result;

	}

}
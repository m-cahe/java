
import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d��° �Է� : ", i + 1);
			arr[i] = scanner.nextInt();
		}
		System.out.print("�Էµ� ���� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

		
		
		
		
		String result="";
		result +="�Էµ� ������ >> ";
		for(int i=0;i<arr.length;i++){
			result+=arr[i]+" ";
		}
	}

}

class idontknow {
	String name;
	int age;

}

import java.util.Scanner;

public class ex_09_2_other {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ܼ� �Է� : ");
		int dan = scanner.nextInt();
		System.out.print("��� ������ ���?  ");
		int stopnum = scanner.nextInt();
		int[] numarr = new int[stopnum];
		System.out.printf("\t%d��\n", dan);
		for (int i = 0; i < numarr.length; i++) {
			numarr[i] = i + 1;
			int result = dan * numarr[i];
			System.out.printf("\t%d*%d=%d\n", dan, numarr[i], result);
		}

	}

}
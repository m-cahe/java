import java.util.Scanner;

public class ex_01���� {

	public static void main(String[] args) {
		
		
		//1. ���ڿ� �迭 ����
		
		String[] arr= {"��", "��"};
		//2. ���� �Է�
		Scanner scanner=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int n=scanner.nextInt();
		//�Է� ���� ���ڿ� ���� �迭�� ����Ǿ��ִ� ������ ���
		//4�� ���ڼ���   7�� ���� ���� ���� ��
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				System.out.printf("%s", arr[0]);
			}
			else {
				System.out.printf("%s", arr[1]);
			}
		}
		

	}

}

import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {
//		�� ������  == != > >= < <=
// 	 	���� ������ (���ǹ�)?     ���϶� (���๮1) :   �����϶�  (���๮2)

		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scanner.nextInt();
		//���۷�����(������ ����) �ڷ��� String �ʿ�
		String total = (num % 2 == 0) ? num + "��(��) ¦���Դϴ�." : num + "��(��) Ȧ���Դϴ�." ;
		System.out.println(total);
		
		scanner.close();
	}

}

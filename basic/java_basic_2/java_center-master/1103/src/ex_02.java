import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		
		/*
		 * int num1=7; int num2=3; double a=(int) num2; 
		 * //syso ->ctrl �����̽� //���� ctrl +
		 * alt + �Ʒ�����Ű System.out.println("���ϱ� ��� : " + (num1+num2));
		 * System.out.println("���� ��� : "+ (num1-num2)); System.out.println("���ϱ� ��� : "+
		 * num1*num2); System.out.println(a); System.out.println("������ ��� : "+ (num1/a));
		 * double b=(double)num1/num2 ; System.out.println(b);
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1=scanner.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2=scanner.nextInt();
		System.out.println("���ϱ� ��� : "+(num1+num2));
		System.out.println("���� ��� : "+(num1-num2));
		System.out.println("���ϱ� ��� : "+(num1*num2));
		float num3=  num2;
		float division = num1/num3;
		System.out.printf("������ ��� : %.3f", division);

//		������ ���� ����  ctrl+d
		
	}

}

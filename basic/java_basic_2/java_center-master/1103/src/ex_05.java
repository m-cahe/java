import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Java ���� �Է� : ");
		int javaScore=scanner.nextInt();
		System.out.print("Web ���� �Է� : ");
		int webScore=scanner.nextInt();
		System.out.print("Android ���� �Է� : ");
		int androidScore=scanner.nextInt();
		System.out.println("�հ� : "+(javaScore+webScore+androidScore));
		System.out.print("��� : "+(javaScore+webScore+androidScore)/3);
		scanner.close();
		
		
		
		
	}

}

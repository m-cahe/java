import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
	
		
		
	Scanner scanner=new Scanner(System.in);
	System.out.print("���� �Է� : ");
	int num=scanner.nextInt();
	if (num%15==0) {
		System.out.printf("%d��(��) 3�� 5�� ����Դϴ�.", num);
	}
	else {
		System.out.printf("%d��(��) 3�� 5�� ����� �ƴմϴ�.", num);
	}
		

	}

}

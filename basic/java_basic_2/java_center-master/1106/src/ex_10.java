import java.util.Scanner;

public class ex_10 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num=scanner.nextInt();
		int i=0;
		int j=0;
		
		System.out.printf("%d�� ��� : ", num);
		for (i=1;i<=num;i++) {
			if(num%i==0) {
				
				j=i;
				System.out.printf("%d", j);
			}
			
			
		}
		
		

	}

}

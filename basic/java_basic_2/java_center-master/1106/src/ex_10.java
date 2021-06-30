import java.util.Scanner;

public class ex_10 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=scanner.nextInt();
		int i=0;
		int j=0;
		
		System.out.printf("%d의 약수 : ", num);
		for (i=1;i<=num;i++) {
			if(num%i==0) {
				
				j=i;
				System.out.printf("%d", j);
			}
			
			
		}
		
		

	}

}

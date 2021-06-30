import java.util.Scanner;

public class ex_07_1 {

	public static void main(String[] args) {
			
		Scanner scanner=new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int n=scanner.nextInt();
		for (int i=1; i<=10; i++) {
			System.out.printf("%d ", n*i);
		}
		

	}

}

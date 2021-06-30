import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
	
		
		
	Scanner scanner=new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num=scanner.nextInt();
	if (num%15==0) {
		System.out.printf("%d은(는) 3과 5의 배수입니다.", num);
	}
	else {
		System.out.printf("%d은(는) 3과 5의 배수가 아닙니다.", num);
	}
		

	}

}

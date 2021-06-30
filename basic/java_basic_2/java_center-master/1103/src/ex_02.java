import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		
		/*
		 * int num1=7; int num2=3; double a=(int) num2; 
		 * //syso ->ctrl 스페이스 //복사 ctrl +
		 * alt + 아래방향키 System.out.println("더하기 결과 : " + (num1+num2));
		 * System.out.println("빼기 결과 : "+ (num1-num2)); System.out.println("곱하기 결과 : "+
		 * num1*num2); System.out.println(a); System.out.println("나누기 결과 : "+ (num1/a));
		 * double b=(double)num1/num2 ; System.out.println(b);
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1=scanner.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2=scanner.nextInt();
		System.out.println("더하기 결과 : "+(num1+num2));
		System.out.println("빼기 결과 : "+(num1-num2));
		System.out.println("곱하기 결과 : "+(num1*num2));
		float num3=  num2;
		float division = num1/num3;
		System.out.printf("나누기 결과 : %.3f", division);

//		빠르게 한줄 삭제  ctrl+d
		
	}

}

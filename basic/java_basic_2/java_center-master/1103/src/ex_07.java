import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {
//		비교 연산자  == != > >= < <=
// 	 	삼항 연산자 (조건문)?     참일때 (실행문1) :   거짓일때  (실행문2)

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		//레퍼런스형(참조형 변수) 자료형 String 필요
		String total = (num % 2 == 0) ? num + "는(은) 짝수입니다." : num + "는(은) 홀수입니다." ;
		System.out.println(total);
		
		scanner.close();
	}

}

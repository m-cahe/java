import java.util.Scanner;

public class ex_01수박 {

	public static void main(String[] args) {
		
		
		//1. 문자열 배열 선언
		
		String[] arr= {"수", "박"};
		//2. 숫자 입력
		Scanner scanner=new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n=scanner.nextInt();
		//입력 받은 숫자에 따라서 배열에 저장되어있는 데이터 출력
		//4는 수박수박   7은 수박 수박 수박 수
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				System.out.printf("%s", arr[0]);
			}
			else {
				System.out.printf("%s", arr[1]);
			}
		}
		

	}

}

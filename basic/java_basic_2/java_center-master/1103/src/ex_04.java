import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
//		import 단축키   ctrl+shift+o
//		Scanner는 불러올때 한번만 불러오면 된다.
		Scanner scanner=new Scanner(System.in);
//		int num;
		
		  System.out.print("정수 입력 >> "); int num=scanner.nextInt();
		  System.out.print("정수 입력 >> "); int num1=scanner.nextInt();
		  System.out.print("입력된 정수는 " + num+ "와(과) "+num1 + "입니다.");
		  
		  scanner.close();
		 

		
	}

}

import java.util.Scanner;

public class ex_05_2 {

	public static void main(String[] args) {

		
	      Scanner sc = new Scanner(System.in);
	      
	      

	      String ID = "Hello";
	      int password = 1234; 
	      String restart = " ";
	      
	      do {System.out.print("아이디를 입력해주세요 >> ");
	         ID = sc.next();
	         System.out.print("비빌번호를 입력해주세요 >>");
	         password = sc.nextInt();
	         if(ID.equals("Hello") && password==1234) {
	         System.out.println("로그인 성공!");
	         break;}      
	         System.out.println("아이디와 비밀번호가 잘못되었습니다.");
	         System.out.println("계속하시겠습니까? (Y/N)>>");
	         restart = sc.next();
	         
	      }while(restart.equals("Y"));
	      System.out.println("종료되었습니다.");
	      

	
	

	}

}

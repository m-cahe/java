import java.util.Scanner;

public class ex_05_3 {

   public static void main(String[] args) {
      //승주누나꺼

      Scanner sc = new Scanner(System.in);

      String input = "";
      String input2 = "";
      String newinput = "";
      do {
         System.out.print("아이디를 입력해주세요: ");
         input = sc.next();

         System.out.print("비번을 입력해주세요 : ");
         input2 = sc.next();

         if (!input.equals("윤승주") || !(input2.equals("1234"))) {

            System.out.print("로그인 계속 진행 하시겠습니까?");
            newinput = sc.next();
            if (!newinput.equals("Y")) {
               break;
            } else if (newinput.equals("N")) {
               System.out.print("로그인 실패");
            }
         }

      }

      while (!input.equals("윤승주") || !input2.equals("1234"));

      
      if (input.equals("윤승주") && (input2.equals("1234"))) {

         System.out.print("로그인 성공!");
      }

      else {
         System.out.print("로그인 실패!");
      }
   }
}
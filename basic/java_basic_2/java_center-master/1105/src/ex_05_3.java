import java.util.Scanner;

public class ex_05_3 {

   public static void main(String[] args) {
      //���ִ�����

      Scanner sc = new Scanner(System.in);

      String input = "";
      String input2 = "";
      String newinput = "";
      do {
         System.out.print("���̵� �Է����ּ���: ");
         input = sc.next();

         System.out.print("����� �Է����ּ��� : ");
         input2 = sc.next();

         if (!input.equals("������") || !(input2.equals("1234"))) {

            System.out.print("�α��� ��� ���� �Ͻðڽ��ϱ�?");
            newinput = sc.next();
            if (!newinput.equals("Y")) {
               break;
            } else if (newinput.equals("N")) {
               System.out.print("�α��� ����");
            }
         }

      }

      while (!input.equals("������") || !input2.equals("1234"));

      
      if (input.equals("������") && (input2.equals("1234"))) {

         System.out.print("�α��� ����!");
      }

      else {
         System.out.print("�α��� ����!");
      }
   }
}
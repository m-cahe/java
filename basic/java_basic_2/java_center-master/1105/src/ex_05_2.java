import java.util.Scanner;

public class ex_05_2 {

	public static void main(String[] args) {

		
	      Scanner sc = new Scanner(System.in);
	      
	      

	      String ID = "Hello";
	      int password = 1234; 
	      String restart = " ";
	      
	      do {System.out.print("���̵� �Է����ּ��� >> ");
	         ID = sc.next();
	         System.out.print("�����ȣ�� �Է����ּ��� >>");
	         password = sc.nextInt();
	         if(ID.equals("Hello") && password==1234) {
	         System.out.println("�α��� ����!");
	         break;}      
	         System.out.println("���̵�� ��й�ȣ�� �߸��Ǿ����ϴ�.");
	         System.out.println("����Ͻðڽ��ϱ�? (Y/N)>>");
	         restart = sc.next();
	         
	      }while(restart.equals("Y"));
	      System.out.println("����Ǿ����ϴ�.");
	      

	
	

	}

}

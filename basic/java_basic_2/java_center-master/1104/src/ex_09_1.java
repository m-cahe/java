import java.util.Scanner;

public class ex_09_1 {

	public static void main(String[] args) {

	

		Scanner sc = new Scanner(System.in);

	      System.out.print("�ݾ��� �Է��ϼ��� : ");
	      int money = sc.nextInt();
	      int coke = 800;
	      int water = 500;
	      int vitWater = 1500;
	      System.out.println("�޴��� ������.");
	      System.out.print("1.�ݶ� :"+coke+"��"+" 2.���� :"+water+"��"+" 3.��Ÿ�ο��� :"+vitWater+"�� >> ");
	      int food = sc.nextInt();
	      int change = 0;
	      
	      switch(food) {
	      case 1:
	      change = money-coke;
	      break;
	      case 2:
	      change = money-water;
	      break;
	      case 3:
	      change = money-vitWater;
	      break;
	      }
	      if(food>=4) {
	         System.out.println("�ٽ� �Է����ּ���.");
	      }
	      else if(change<0) {
	         System.out.println("�ܾ��� �����մϴ�.");
	         int change1=Math.abs(change);
	         System.out.println("������ �ܾ� : "+change1+"��");
	      }else {
	       
	      System.out.println("�ܵ� : "+change);
	      System.out.println("õ �� : "+change/1000+"��");
	      System.out.println("���� �� : "+(change%1000)/500+"��");
	      System.out.println("�� �� : "+(change%1000)%500/100+"��");
	      }
	}

}

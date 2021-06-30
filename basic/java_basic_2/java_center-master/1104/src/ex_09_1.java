import java.util.Scanner;

public class ex_09_1 {

	public static void main(String[] args) {

	

		Scanner sc = new Scanner(System.in);

	      System.out.print("금액을 입력하세요 : ");
	      int money = sc.nextInt();
	      int coke = 800;
	      int water = 500;
	      int vitWater = 1500;
	      System.out.println("메뉴를 고르세요.");
	      System.out.print("1.콜라 :"+coke+"원"+" 2.생수 :"+water+"원"+" 3.비타민워터 :"+vitWater+"원 >> ");
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
	         System.out.println("다시 입력해주세요.");
	      }
	      else if(change<0) {
	         System.out.println("잔액이 부족합니다.");
	         int change1=Math.abs(change);
	         System.out.println("부족한 잔액 : "+change1+"원");
	      }else {
	       
	      System.out.println("잔돈 : "+change);
	      System.out.println("천 원 : "+change/1000+"개");
	      System.out.println("오백 원 : "+(change%1000)/500+"개");
	      System.out.println("백 원 : "+(change%1000)%500/100+"개");
	      }
	}

}

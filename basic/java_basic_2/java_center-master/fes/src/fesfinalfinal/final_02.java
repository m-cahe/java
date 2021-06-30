package fesfinalfinal;

import java.util.Scanner;

public class final_02 {

	public static void main(String[] args) {
		int money=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int time=scanner.nextInt();
		if(time >8) {
			int extraTime=time-8;
			time-=extraTime;
			money=(int)(time*5000+extraTime*1.5*5000);
		}
		else {
			money=time*5000;
		}
		System.out.printf("총 임금은 %d원입니다.", money);

	}

}

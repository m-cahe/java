package fesfinalfinal;

import java.util.Scanner;

public class final_02 {

	public static void main(String[] args) {
		int money=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int time=scanner.nextInt();
		if(time >8) {
			int extraTime=time-8;
			time-=extraTime;
			money=(int)(time*5000+extraTime*1.5*5000);
		}
		else {
			money=time*5000;
		}
		System.out.printf("�� �ӱ��� %d���Դϴ�.", money);

	}

}

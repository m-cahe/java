package fesfinalfinal;

import java.util.Scanner;

public class final_08 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num=scanner.nextInt();
		double num1= (double)(num%10)/10;
		
		int result=0;
		if(10*num1 <=4) {
			result=(int)(num-10*num1);
		}		
		else {
			result=(int)(num-10*num1+10);
		}
		System.out.printf("�ݿø� �� : %d", result);
		
}

}

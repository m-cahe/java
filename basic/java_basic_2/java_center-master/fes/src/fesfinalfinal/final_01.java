package fesfinalfinal;

import java.util.Scanner;

public class final_01 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=1;
		System.out.print("현재 몸무게 : ");
		double currentWeight=scanner.nextDouble();
		System.out.print("목표 몸무게 : ");
		double targetWeight=scanner.nextDouble();
		while(currentWeight>targetWeight) {
			System.out.printf("%d주차 몸무게 : ", n);
			double reductionWeight=scanner.nextDouble();
			currentWeight-=reductionWeight;
			
		}
		System.out.printf("%.1fkg 달성!! 축하합니다!",currentWeight );

	}

}

package fesfinalfinal;

import java.util.Scanner;

public class final_01 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=1;
		System.out.print("���� ������ : ");
		double currentWeight=scanner.nextDouble();
		System.out.print("��ǥ ������ : ");
		double targetWeight=scanner.nextDouble();
		while(currentWeight>targetWeight) {
			System.out.printf("%d���� ������ : ", n);
			double reductionWeight=scanner.nextDouble();
			currentWeight-=reductionWeight;
			
		}
		System.out.printf("%.1fkg �޼�!! �����մϴ�!",currentWeight );

	}

}

package fes_1;

import java.util.Scanner;

public class fes_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		double currentWeight = scanner.nextDouble();
		System.out.print("목표 몸무게 : ");
		double targetWeight = scanner.nextDouble();
		int week = 0;

		/*
		 * do { ++week; System.out.printf("%d주차 감량 몸무게 : ", week); double
		 * weightReduction = scanner.nextDouble(); currentWeight -= weightReduction; }
		 * while (currentWeight >= targetWeight);
		 */
		for (week = 1; currentWeight > targetWeight; week++) {
			System.out.printf("%d주차 감량 몸무게 : ", week);
			double weightReduction = scanner.nextDouble();
			currentWeight -= weightReduction;
		}

		System.out.printf("%.1fkg 달성!! 축하합니다!!", currentWeight);

	}

}
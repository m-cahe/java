import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		double currentWeight = scanner.nextDouble();
		System.out.print("목표 몸무게 : ");
		double futureWeight = scanner.nextDouble();
		int n = 0;
		double weightReduction = 0;
		do {
			++n;
			System.out.printf("%d주차 감량 몸무게 : ", n);
			weightReduction = scanner.nextDouble();
			currentWeight -= weightReduction;
		} while (currentWeight >= futureWeight);
		System.out.printf("%.1fkg 달성!! 축하합니다!", currentWeight);
	}

}

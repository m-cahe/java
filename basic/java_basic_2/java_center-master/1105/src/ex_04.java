import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ������ : ");
		double currentWeight = scanner.nextDouble();
		System.out.print("��ǥ ������ : ");
		double futureWeight = scanner.nextDouble();
		int n = 0;
		double weightReduction = 0;
		do {
			++n;
			System.out.printf("%d���� ���� ������ : ", n);
			weightReduction = scanner.nextDouble();
			currentWeight -= weightReduction;
		} while (currentWeight >= futureWeight);
		System.out.printf("%.1fkg �޼�!! �����մϴ�!", currentWeight);
	}

}

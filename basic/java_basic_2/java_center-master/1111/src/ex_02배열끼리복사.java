
public class ex_02�迭�������� {

	public static void main(String[] args) {

		// ������ �迭
		int[] myArray = { 1, 2, 3, 4, 5 };
		// �������迭
		int[] array = myArray;
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%s ", array[i]);
		}
		System.out.println("\n���� �� : "+array[2]);
		array[2]=4;
		System.out.println("���� �� : "+array[2]);
		System.out.println("myAraay�� 2��° �ε��� "+myArray[2]);

	}

}

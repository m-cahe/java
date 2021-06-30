
public class ex_02배열끼리복사 {

	public static void main(String[] args) {

		// 정수형 배열
		int[] myArray = { 1, 2, 3, 4, 5 };
		// 정수형배열
		int[] array = myArray;
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%s ", array[i]);
		}
		System.out.println("\n변경 전 : "+array[2]);
		array[2]=4;
		System.out.println("변경 후 : "+array[2]);
		System.out.println("myAraay의 2번째 인덱스 "+myArray[2]);

	}

}

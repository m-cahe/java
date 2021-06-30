
public class ex_04 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		System.out.printf("\nÇÕ  : %d", sum);
		double average = (double) sum / 100;
		System.out.printf("\nÆò±Õ : %.1f", average);

		int multiple=1;
		for (int i = 0; i < 19; i++) {
			multiple *= arr[i];

		}
		
		System.out.printf("\n°ö  : %d", multiple);
		
		int[] numarr=new int[200];
		
		
		
		
	}

}

class cat {
	String name;
	int age;
	double weight;

	void melow() {
		System.out.print("±×¸£¸ª ±×¸£¸ª");
	}

	void bark() {
		System.out.print("¾ß¿Ë ¾ß¿Ë");
	}
}

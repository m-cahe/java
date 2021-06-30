
public class ex_01 {

	public static void main(String[] args) {
		
		int[] arr= new int [10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=0;
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		String[] arr1= new String [10];
		for(int i=0; i<arr1.length; i++) {
			arr1[i]="\"\"";
			System.out.printf("%s ", arr1[i]);
		}
		System.out.println();
		
		int[] arr2= new int [100];
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=0;
			System.out.printf("%d ", arr2[i]);
		}
		System.out.println();
		String[] arr3= new String [100];
		for(int i=0; i<arr3.length; i++) {
			arr3[i]="\"\"";
			System.out.printf("%s ", arr3[i]);
		}

	}

}

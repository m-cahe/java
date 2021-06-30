import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int i=scanner.nextInt();
		int j=0;
		int[] arr=new int[10];
		for (j=0;j<arr.length;j++) {
			arr[j]=i*(j+1);
			System.out.printf("%d ", arr[j]);
		}
		

	}

}

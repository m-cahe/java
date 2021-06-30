import java.util.Scanner;

public class ex_08_temp {

	public static void main(String[] args) {
int temp;
	int max=-1;
		int[] array= {5,8,3,22,12};
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max=array[i];
				
			}
		}
		System.out.printf("\n최댓값은 %d입니다.", max);
		
		/*
		 * //temp 
		 * temp=max; 
		 * max=array[0];
		 *  array[0]=temp;
		 */
		
	

	}

}

import java.util.Scanner;

public class ex_10_2 {

	
	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int num=scanner.nextInt();//�Է��� ����
			int[] numarr=new int [num];//�Է��� ���� �迭 ����
			//�迭���� ���� ����
			System.out.printf("%d�� ��� : ", num);
			for (int i=0;i<numarr.length;i++) {
				numarr[i]=i+1;
				if(num%numarr[i]==0) {
					System.out.printf("%d ",numarr[i]);
				}
			}

	}

}

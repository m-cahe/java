package fes_2;

import java.util.Scanner;

public class fes_9 {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.print("���� �Է� >> ");
	int num=scanner.nextInt();
	int mok=0;//��
	int nmg=0;//������
	int n=0;
	int[] arr= new int [100];
	System.out.print("�������� : ");
	do {
		mok=num/2;
		nmg=num-2*mok;
		System.out.printf("%d ", nmg);
		arr[n]= nmg;
		num=num/2;
		n++;
		
	}while(mok!=0);
	System.out.print("\n���� �迭�� ũ�� : ");
	System.out.printf("%d\n", n);
	System.out.print("2���� ǥ�� : ");
	for(int i=0; i<n; i++) {
		System.out.printf("%d ", arr[n-i-1]);
	}
	scanner.close();
	}

}

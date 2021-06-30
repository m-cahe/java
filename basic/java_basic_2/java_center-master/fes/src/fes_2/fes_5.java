package fes_2;

public class fes_5 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int f=0;
		String[] score = { "A", "A", "B", "C", "D", "A", "C", "D", "D", "D", "F" };
		for (int i = 0; i < score.length; i++) {
			if (score[i].equals("A")) {
				a++;
			}
			else if (score[i].equals("B")) {
				b++;
			}
			else if (score[i].equals("C")) {
				c++;
			}
			else if (score[i].equals("D")) {
				d++;
			}
			else {
				f++;
			}
		}
		System.out.printf("A : %d명\n", a);
		System.out.printf("B : %d명\n", b);
		System.out.printf("C : %d명\n", c);
		System.out.printf("D : %d명\n", d);
		System.out.printf("F : %d명\n", f);
		
		
		
	}

}

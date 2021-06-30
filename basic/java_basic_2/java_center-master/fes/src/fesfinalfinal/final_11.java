package fesfinalfinal;

import java.util.Random;

public class final_11 {

	public static void main(String[] args) {
		String score="A,A,B,C,D,A,C,D,D,D,F";
		String[] scoreArray=score.split(",");
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int f=0;
		for (int i = 0; i < scoreArray.length; i++) {
			if(scoreArray[i].equals("A")) {
				a++;
			}
			else if(scoreArray[i].equals("B")) {
				b++;
			}
			else if(scoreArray[i].equals("C")) {
				c++;
			}
			else if(scoreArray[i].equals("D")) {
				d++;
			}
			else if(scoreArray[i].equals("F")) {
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

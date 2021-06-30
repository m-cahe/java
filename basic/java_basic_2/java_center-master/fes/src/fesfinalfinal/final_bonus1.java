package fesfinalfinal;

import java.util.Scanner;

public class final_bonus1 {

	public static void main(String[] args) {

		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println(findKim(names));
	}

	public static String findKim(String[] str) {
		int n = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("Kim")) {
				n = i + 1;
			}

		}
		String A="김서방은 "+n+"에 있다.";
		return A;

	}

}

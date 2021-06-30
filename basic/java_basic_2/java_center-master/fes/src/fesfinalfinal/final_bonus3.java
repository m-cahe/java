package fesfinalfinal;

import java.util.Scanner;

public class final_bonus3 {

	public static void main(String[] args) {

		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
	}

	public static String getMiddle(String a) {
		String[] arr = a.split("");
		int index = 0;
		String result = "";
		if (arr.length % 2 == 0) {
			index = (arr.length - 1) / 2;
			result =  arr[index]+arr[index + 1];
		} else {
			index = (arr.length - 1) / 2;
			result = arr[index];
		}
		return result;
	}

}

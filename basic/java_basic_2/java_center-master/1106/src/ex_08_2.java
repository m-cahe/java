import java.util.Scanner;

public class ex_08_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 알파벳 : ");
		char first = sc.nextLine().charAt(0);
		System.out.print("마지막 알파벳 : ");
		char last = sc.nextLine().charAt(0);

		int ifirst = (int) first;
		int ilast = (int) last;

		for (ifirst = ifirst; ifirst <= ilast; ifirst++) {
			char cafirst = (char) ifirst;
			char calast = (char) ilast;
			System.out.printf("%s", cafirst);
		}

	}

}

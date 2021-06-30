package Studentpack;

import java.util.Scanner;

//객체배열
public class StudentMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Student stu1 = new Student("손준호", 1, 15); Student stu2 = new Student("오주율",
		 * 2, 30); Student stu3 = new Student("오유정", 3, 24); Student stu4 = new
		 * Student("조조세핀", 4, 19);
		 * 
		 * System.out.printf("%s : %d반 %d번\n", stu1.getName(), stu1.getBan(),
		 * stu1.getNum()); System.out.printf("%s : %d반 %d번\n", stu2.getName(),
		 * stu2.getBan(), stu2.getNum()); System.out.printf("%s : %d반 %d번\n",
		 * stu3.getName(), stu3.getBan(), stu3.getNum());
		 * System.out.printf("%s : %d반 %d번\n", stu4.getName(), stu4.getBan(),
		 * stu4.getNum());
		 * 
		 * ///객체배열 이용 //String 타입의 변수들을 저장할수있는 하나의 레퍼런스 변수 생성하고 //거기에 좋아하는 음료수 3개 넣기
		 * String[] drink= {"콜라", "사이다", "솔의눈"};
		 */
		//
		Student[] arr = new Student[4];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 입력 : ");
			String name = scanner.next();
			System.out.print("반 입력 : ");
			int ban = scanner.nextInt();
			System.out.print("번호 입력 : ");
			int num = scanner.nextInt();
			arr[i] = new Student(name, ban, num);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%s : %d반 %d번\n", arr[i].getName(), arr[i].getBan(), arr[i].getNum());
		}

	}
}

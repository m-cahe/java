package Studentpack;

import java.util.Scanner;

//��ü�迭
public class StudentMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Student stu1 = new Student("����ȣ", 1, 15); Student stu2 = new Student("������",
		 * 2, 30); Student stu3 = new Student("������", 3, 24); Student stu4 = new
		 * Student("��������", 4, 19);
		 * 
		 * System.out.printf("%s : %d�� %d��\n", stu1.getName(), stu1.getBan(),
		 * stu1.getNum()); System.out.printf("%s : %d�� %d��\n", stu2.getName(),
		 * stu2.getBan(), stu2.getNum()); System.out.printf("%s : %d�� %d��\n",
		 * stu3.getName(), stu3.getBan(), stu3.getNum());
		 * System.out.printf("%s : %d�� %d��\n", stu4.getName(), stu4.getBan(),
		 * stu4.getNum());
		 * 
		 * ///��ü�迭 �̿� //String Ÿ���� �������� �����Ҽ��ִ� �ϳ��� ���۷��� ���� �����ϰ� //�ű⿡ �����ϴ� ����� 3�� �ֱ�
		 * String[] drink= {"�ݶ�", "���̴�", "���Ǵ�"};
		 */
		//
		Student[] arr = new Student[4];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸� �Է� : ");
			String name = scanner.next();
			System.out.print("�� �Է� : ");
			int ban = scanner.nextInt();
			System.out.print("��ȣ �Է� : ");
			int num = scanner.nextInt();
			arr[i] = new Student(name, ban, num);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%s : %d�� %d��\n", arr[i].getName(), arr[i].getBan(), arr[i].getNum());
		}

	}
}

package Personpackage;

public class Main {

	public static void main(String[] args) {
	
		Person person1=new Person();
		person1.setName("����ȣ");
		person1.setAge(28);
		
		System.out.println("st1��ü �л� �̸� : "+person1.getName() + ", ���� : "+person1.getAge() );
		
		Person person2=new Person("������", 20);
		
		System.out.println("st2��ü �л� �̸� : "+person2.getName() + ", ���� : "+person2.getAge() );
		

	}

}

package Personpackage;

public class Main {

	public static void main(String[] args) {
	
		Person person1=new Person();
		person1.setName("손준호");
		person1.setAge(28);
		
		System.out.println("st1객체 학생 이름 : "+person1.getName() + ", 나이 : "+person1.getAge() );
		
		Person person2=new Person("오주율", 20);
		
		System.out.println("st2객체 학생 이름 : "+person2.getName() + ", 나이 : "+person2.getAge() );
		

	}

}


public class Main {
	public static void main(String[] args) {

		Student student1 = new Student("나예호", "20190675", 21, 50, 89, 77);

		Student student2 = new Student("김운비", "20200541", 20, 81, 100, 95);

		student1.show();

		student2.show();
		Student student3 = new Student("오주율", "20210655");
		student3.setAge(19);
		student3.setScoreJava(100);
		student3.setScoreAndroid(100);
		student3.setScoreWeb(100);
	String name =student3.getName();
	System.out.println(name+"  이름");
		student3.show();

	}
}

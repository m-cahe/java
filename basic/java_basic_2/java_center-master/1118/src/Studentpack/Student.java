package Studentpack;

public class Student {
	private String name;
	private int ban;
	private int num;
	

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getNum() {
		return num;
	}

	public Student(String name, int ban, int num) {

		this.name = name;
		this.ban = ban;
		this.num = num;
	}
}

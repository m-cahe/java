package model;

public class insertVO {
//vo 는 value object
//기능단위로 봤을 때 필요한 자료형의 묶음
//회원가입 기능을 할 때 필요한 자료형들의 묶음
	// 생성자 게터세터 메소드 구현
	private String id, pw, name;
	private int age;

	public insertVO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public insertVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

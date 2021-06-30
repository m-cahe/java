package model;

public class insertVO {
//vo �� value object
//��ɴ����� ���� �� �ʿ��� �ڷ����� ����
//ȸ������ ����� �� �� �ʿ��� �ڷ������� ����
	// ������ ���ͼ��� �޼ҵ� ����
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

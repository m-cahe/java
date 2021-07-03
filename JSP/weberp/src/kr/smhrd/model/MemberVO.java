package kr.smhrd.model;

public class MemberVO {

	private int num;
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String email;
	private String addr;

// 6�� ������
	public MemberVO(String id, String pw, String name, String tel, String email, String addr) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
	}

// 7�� ������
	public MemberVO(int num, String id, String pw, String name, String tel, String email, String addr) {
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
	}

// ����Ʈ ������
	public MemberVO() {
	}

	// update ������
	public MemberVO(int num, String tel, String email, String addr) {
		this.num = num;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
	}

	// �������̵� ����Ʈ��
	@Override
	public String toString() {
		return "MemberVO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + ", email="
				+ email + ", addr=" + addr + "]";
	}

//���� ����
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}

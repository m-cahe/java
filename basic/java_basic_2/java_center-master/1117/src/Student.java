
public class Student {

	private String name; // �̸�
	private String number;// �й�
	private int age;// ����
	private int scoreJava;// Java��
	private int scoreWeb;// Web����
	private int scoreAndroid;// Android����
	// ������
	// 1. �����ڴ� �޼ҵ��.
	// 2. �����ڴ� new Ű���� ���� ȣ��
	// 3. �������� �̸��� Ŭ������ �̸��� ����
	// 4. �������� �����ڸ� ������ �ʾ������� default �����ڰ� �����Ȱ��ϻ�
	// 5. �ϳ��� Ŭ������ �ݵ�� �ϳ� �̻��� �����ڰ� �־�� �Ѵ�.
	// 6. ������ ����Ÿ�� ��ü������.
	// 7. �Ű������� �Ӽ����� �� �޾Ƽ� ä���ֱ�!!!
//this�� ���� Ŭ���� �ڽ��� ��Ī
	

	public Student(String name, String number, int age, int scoreJava,
			int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	//�޼ҵ� �����ε� �Ű����� ���� Ÿ�� �ٸ����ϴ°�
	//����Ÿ�Դٸ��ٰ� �����ε� �ƴϴ�
	//�޼ҵ� �̸� ����
	public Student(String name, String number) {
		this.name = name;
		this.number = number;
	}
//�̰Ŵ� �̸��̶� �й���

	public void show() {
		System.out.printf("%s�� �ȳ��ϼ���\n", name);
		System.out.printf("[ %s, %d�� ]\n", number, age);
		System.out.printf("%s���� �ڹ� ������ %d���Դϴ�.\n", name, scoreJava);
		System.out.printf("%s���� Web ������ %d���Դϴ�.\n", name, scoreWeb);
		System.out.printf("%s���� �ȵ���̵� ������ %d���Դϴ�.\n", name, scoreAndroid);
		System.out.println("========================");

	}
	//�����ϱ����� getter setter ����
	// �����ִ� �޼ҵ�
	public String getName() {
		return name;
	}
	//�������ִ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}


}


public class Student {

	private String name; // 이름
	private String number;// 학번
	private int age;// 나이
	private int scoreJava;// Java점
	private int scoreWeb;// Web점수
	private int scoreAndroid;// Android점수
	// 생성자
	// 1. 생성자는 메소드다.
	// 2. 생성자는 new 키워드 사용시 호출
	// 3. 생성자의 이름은 클래스의 이름과 같다
	// 4. 개발자자 생성자를 만들지 않았을때에 default 생성자가 생략된것일뿐
	// 5. 하나의 클래스의 반드시 하나 이상의 생성자가 있어야 한다.
	// 6. 생성자 리턴타입 자체가없다.
	// 7. 매개변수로 속성값들 다 받아서 채워주기!!!
//this는 현재 클래스 자신을 지칭
	

	public Student(String name, String number, int age, int scoreJava,
			int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	//메소드 오버로딩 매개변수 갯수 타입 다르게하는거
	//리턴타입다르다고 오버로딩 아니다
	//메소드 이름 동일
	public Student(String name, String number) {
		this.name = name;
		this.number = number;
	}
//이거는 이름이랑 학번만

	public void show() {
		System.out.printf("%s님 안녕하세요\n", name);
		System.out.printf("[ %s, %d살 ]\n", number, age);
		System.out.printf("%s님의 자바 점수는 %d점입니다.\n", name, scoreJava);
		System.out.printf("%s님의 Web 점수는 %d점입니다.\n", name, scoreWeb);
		System.out.printf("%s님의 안드로이드 점수는 %d점입니다.\n", name, scoreAndroid);
		System.out.println("========================");

	}
	//접근하기위해 getter setter 설정
	// 돌려주는 메소드
	public String getName() {
		return name;
	}
	//저장해주는 메소드
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

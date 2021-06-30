package Pokemon;

public abstract class Pokemon {
	protected String name;
	protected String type;
	protected int hp;
	protected int atk;
	protected int def;

	public int attack() {
		return atk;
	}
//추상메소드 특징
//1. 몸통이 없다. 
//2. 추상메소드는 추상클래스에서만 사용된다.
	//3. 강제성을 가진다
	//클래스간의 공통점을 찾아내서 공통의 조상을 만드는 작업
	//상속관계에서 서브클래스가 반드시 구현해야함을 알릴때
	//객체 생성 X 

	public abstract int sAttack();
}

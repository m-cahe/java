package ex_보충;

public abstract class human extends Creature implements Talkable, Codable, Swimmable {

	public human(int age, int x, int y, double length, boolean spine) {
		super(age, x, y, length, spine);
	}

	@Override
	public void attack() {
		System.out.println("도구 사용해서 공격!!");
	}

	@Override
	public void walk() {
		System.out.println("직립 보행!!");
	}

	@Override
	public void talk() {
		System.out.println("말하기!!");

	}

}

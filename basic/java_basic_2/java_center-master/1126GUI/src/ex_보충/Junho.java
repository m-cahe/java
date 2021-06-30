package ex_보충;

public class Junho extends human implements Codable, Swimmable {

	public Junho(int age, int x, int y, double length, boolean spine) {
		super(age, x, y, length, spine);
	}

	@Override
	public void attack() {
		super.attack();
	}

	@Override
	public void walk() {
		super.walk();
	}

	@Override
	public void talk() {
		System.out.println("스마트그리드 2차반 안녕~! 오늘 어렵죠? 원래 어려워요");

	}

	@Override
	public void coding() {
		System.out.println("Hello world!!");

	}

	@Override
	public void swimming() {
		// 10씩 마이너스 하기

		super.y -= 10;
		if (y < -100) {
			System.out.println("그만 입수해!!!");
		}

	}

	@Override
	public String toString() {
		return "Junho [age=" + age + ", x=" + x + ", y=" + y + ", length=" + length + ", spine=" + spine + "]";
	}

}

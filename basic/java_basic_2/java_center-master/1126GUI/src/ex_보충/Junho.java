package ex_����;

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
		System.out.println("����Ʈ�׸��� 2���� �ȳ�~! ���� �����? ���� �������");

	}

	@Override
	public void coding() {
		System.out.println("Hello world!!");

	}

	@Override
	public void swimming() {
		// 10�� ���̳ʽ� �ϱ�

		super.y -= 10;
		if (y < -100) {
			System.out.println("�׸� �Լ���!!!");
		}

	}

	@Override
	public String toString() {
		return "Junho [age=" + age + ", x=" + x + ", y=" + y + ", length=" + length + ", spine=" + spine + "]";
	}

}

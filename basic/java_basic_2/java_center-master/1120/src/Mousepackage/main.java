package Mousepackage;

public class main {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.click();
		mouse.rightClick();
		mouse.drag();
		System.out.println("================");
		WheelMouse wheel = new WheelMouse();
		wheel.click();
		wheel.rightClick();
		wheel.drag();
		wheel.scroll();
		System.out.println("================");
		GamingMouse gm = new GamingMouse();
		gm.macro();
		gm.click();
//�޼ҵ� �������̵�
		//����Ŭ������ �޼ҵ带 ����Ŭ�������� �ٽ� �������ϴ°�
		//�Ű����� Ÿ�� ����Ÿ�Ե� ��ġ
	}

}

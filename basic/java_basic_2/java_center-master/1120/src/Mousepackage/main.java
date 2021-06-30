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
//메소드 오버라이딩
		//슈퍼클래스의 메소드를 서브클래스에서 다시 재정의하는거
		//매개변수 타입 리턴타입도 일치
	}

}

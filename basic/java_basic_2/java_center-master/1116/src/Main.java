
public class Main {

	public static void main(String[] args) {
//     클래스 로 만들면 객체  객체가 구현되면  인스턴스
		Monitor monitor = new Monitor();

		monitor.isPower = false;
		monitor.screenBrightness = 50;


		// 밝기조절 메소드
		monitor.brightnessControl(290);
		// 이때 밝기를 100으로 만들기

		// 전원 켜고 끄는 메소드
	
		monitor.info();

		Monitor monitor2 = new Monitor();
		monitor2.isPower = false;
		monitor2.screenBrightness = 300;
		monitor2.info();
		monitor2.powering();
		monitor2.info();

	}

}

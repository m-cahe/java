
public class Main {

	public static void main(String[] args) {
//     Ŭ���� �� ����� ��ü  ��ü�� �����Ǹ�  �ν��Ͻ�
		Monitor monitor = new Monitor();

		monitor.isPower = false;
		monitor.screenBrightness = 50;


		// ������� �޼ҵ�
		monitor.brightnessControl(290);
		// �̶� ��⸦ 100���� �����

		// ���� �Ѱ� ���� �޼ҵ�
	
		monitor.info();

		Monitor monitor2 = new Monitor();
		monitor2.isPower = false;
		monitor2.screenBrightness = 300;
		monitor2.info();
		monitor2.powering();
		monitor2.info();

	}

}


public class Monitor {

	public boolean isPower;
	public int screenBrightness;

	public void brightnessControl(int screenBrightness) {
		this.screenBrightness = screenBrightness;

	}

	public void powering() {
		isPower = !isPower;
	}

	// ���� �������¿� ��� ���¸� ���
	public void info() {
		System.out.printf("���� ���� : %d\n���� ���� ���´� %b\n", screenBrightness, isPower);
	}
}

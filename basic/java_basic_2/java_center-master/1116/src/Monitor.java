
public class Monitor {

	public boolean isPower;
	public int screenBrightness;

	public void brightnessControl(int screenBrightness) {
		this.screenBrightness = screenBrightness;

	}

	public void powering() {
		isPower = !isPower;
	}

	// 지금 전원상태와 밝기 상태를 출력
	public void info() {
		System.out.printf("현재 밝기는 : %d\n현재 전원 상태는 %b\n", screenBrightness, isPower);
	}
}

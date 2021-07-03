package kr.smhrd;

public class ExecClass {

	public static void main(String[] args) {
		// 1.
		class GameManager{		// �ٸ� �������� ��� �� �ϰ� ���� �� �޼ҵ� �������� ����� �� �ִ� Ŭ����. Ŭ���� ������ �ϳ� �� ����� ���� �ȴ�.
			public boolean doGame(Horse[] horse) {
				boolean isEnd = true;	// Horse�� isEnd�� �ٸ� isEnd��. �� ��ġ�� �����ϰ� �� ���� ��ü�� isEnd�� ���ؾ� ��� ���� ������ �� �ְ� return�� �������� �� �ִ�.
				for (int i = 0; i < horse.length; i++) {	// Horse ��ü�� 0������ n������ �޸��� ����� �ݺ���
					horse[i].runHorse();
					isEnd = isEnd && horse[i].isEnd; // doGame���� true�� ���� ����
				}
				return isEnd;
			}
		}
		// Horse ��ü ����
		Horse[] horse = {new Horse("�����"),new Horse("������")};
		
		// GameManager �޸𸮿� �Ҵ�
		GameManager gameManager = new GameManager();
		
		// ���� ������Ű�� �ݺ���
		for (int i = 0; i < 99999; i++) {
			boolean isEnd = gameManager.doGame(horse);
			System.out.println("---------------------------------");
			if (isEnd) {
				break;
			}
		}
	}
}
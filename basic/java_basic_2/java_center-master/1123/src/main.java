import Pokemon.Ninetail;
import Pokemon.Pokemon;
import Pokemon.gozi;
import Pokemon.pizon2;

public class main {
	public static void main(String[] args) {
		// �θ�Ŭ�������� ��ӹ��� �ڽ�Ŭ������ ������ ������
		// �θ�Ŭ���� ���·� �ν��Ͻ��� �����ϸ�
		// �θ�Ŭ���� �迭�� �����͸� �ٷ�� ����
		// Object�� �� �� ����Ŭ����
		Pokemon[] pk = new Pokemon[3];

		
		
		Pokemon nT = new Ninetail();
		Pokemon p2 = new pizon2();
		Pokemon gz = new gozi();
		pk[0] = nT;
		pk[1] = p2;
		pk[2] = gz;
		for (int i = 0; i < pk.length; i++) {
			System.out.println(pk[i].toString());
		}

	}
}

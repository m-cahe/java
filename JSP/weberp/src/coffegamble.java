import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class coffegamble {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] arr1 = { "����ȣ", "������", "������", "��⿵", "������" };
		String[] arr2 = { "����ȣ", "������", "������", "������", "������" };
		String[] arr3 = { "����ȣ", "������", "������", "������", "������" };
		String[] arr4 = { "����ȣ", "�����", "������", "�Ӹ���", "������" };
		String[] arr5 = { "����ȣ", "������", "�����", "������", "������" };
		String[] arr6 = { "����ȣ", "������", "������", "�����", "�Ӹ���" };
		String[] name = { "����ȣ", "������", "�����", "������", "�����", "������" };
		Map<String, Integer> hm = new HashMap<>();
		ArrayList<String[]> list = new ArrayList<>();
		int count = 0;
		int k = 0;
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		list.add(arr4);
		list.add(arr5);
		list.add(arr6);

		System.out.print("���� �Է� : ");
		String[] team = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };
//
//		for (int i = 0; i < team.length; i++) {
//			System.out.println(team[i]);
//		}

		Iterator<String[]> it = list.iterator();
		while (it.hasNext()) {
			count = 0;
			String[] a = it.next();
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < team.length; j++) {
					if (a[i].equals(team[j])) {
						count++;
					}
				}
			}
			hm.put(name[k], count);
			k++;
		}

		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i] + "  :  " + hm.get(name[i]));
		}

		List<String> keyList = new ArrayList<>(hm.keySet());
		Collections.sort(keyList, (o1,o2)->(hm.get(o2).compareTo(hm.get(o1))));
		System.out.println("�ɸ� ��� : "+keyList.get(5));

	}
}

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
		String[] arr1 = { "손준호", "장현석", "신은정", "양기영", "오주율" };
		String[] arr2 = { "손준호", "장현석", "오유정", "신은정", "문형근" };
		String[] arr3 = { "손준호", "오유정", "신은정", "오주율", "문형근" };
		String[] arr4 = { "손준호", "오경민", "장현석", "임마루", "신은정" };
		String[] arr5 = { "손준호", "장현석", "오경민", "도한재", "오유정" };
		String[] arr6 = { "손준호", "오유정", "신은정", "오경민", "임마루" };
		String[] name = { "손준호", "도한재", "오경민", "오유정", "김민희", "장현석" };
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

		System.out.print("팀장 입력 : ");
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
		System.out.println("걸린 사람 : "+keyList.get(5));

	}
}

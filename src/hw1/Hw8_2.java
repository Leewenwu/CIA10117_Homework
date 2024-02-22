package hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hw8_2 {
	public static void main(String[] args) {
//	• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，
//	放到每小題需使用的集合裡
//		(202, "普悠瑪", "樹林", "花蓮", 400)
//		(1254, "區間", "屏東", "基隆", 700)
//		(118, "自強", "高雄", "台北", 500)
//		(1288, "區間", "新竹", "基隆", 400)
//		(122, "自強", "台中", "花蓮", 600)
//		(1222, "區間", "樹林", "七堵", 300)
//		(1254, "區間", "屏東", "基隆", 700)
//		• 請寫一隻程式，能印出不重複的Train物件
		Hw8_Train t1 = new Hw8_Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Hw8_Train t2 = new Hw8_Train(1254, "區間", "屏東", "基隆", 700);
		Hw8_Train t3 = new Hw8_Train(118, "自強", "高雄", "台北", 500);
		Hw8_Train t4 = new Hw8_Train(1288, "區間", "新竹", "基隆", 400);
		Hw8_Train t5 = new Hw8_Train(122, "自強", "台中", "花蓮", 600);
		Hw8_Train t6 = new Hw8_Train(1222, "區間", "樹林", "七堵", 300);
		Hw8_Train t7 = new Hw8_Train(1254, "區間", "屏東", "基隆", 700);

		Set<Hw8_Train> set = new HashSet<>();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		System.out.println("不重複，使用迭代器 HashSet：");
		Iterator<Hw8_Train> obj = set.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
		System.out.println("===========================");
//	• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		List<Hw8_Train> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);

		Collections.sort(list);
		System.out.println("重複、編號大到小排序，使用for迴圈 ArrayList：");
		for (int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			System.out.println(o);
		}
		System.out.println("===========================");
//	• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
//	• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
		TreeSet<Hw8_Train> Tset = new TreeSet<>();
		Tset.add(t1);
		Tset.add(t2);
		Tset.add(t3);
		Tset.add(t4);
		Tset.add(t5);
		Tset.add(t6);
		Tset.add(t7);
		System.out.println("不重複、編號大到小排序，使用for-each TreeSet：");
		for (Hw8_Train T : Tset) {
			System.out.println(T);
		}

	}

}
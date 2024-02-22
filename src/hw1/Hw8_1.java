package hw1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw8_1 {

	public static void main(String[] args) {
//	• 請建立一個Collection物件並將以下資料加入：
//		Integer(100)
//		Double(3.14)
//		Long(21L)
//		Short(“100”)
//		Double(5.1)
//		“Kitty”
//		Integer(100)	
//		Object物件、
//		“Snoopy”
//		BigInteger(“1000”)
		List<Object> list = new ArrayList<Object>();
		list.add(new Integer(100));
		list.add(Double.valueOf(3.14));
		list.add(Long.valueOf(21L));
		list.add(Short.valueOf("100"));
		list.add(Double.valueOf(5.1));
		list.add("Kitty");
		list.add(Integer.valueOf(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
//	• 印出這個物件裡的所有元素(使用Iterator, 傳統for與for each)
//		Iterator<?> obj = list.iterator(); 				// Iterator方法
//		while (obj.hasNext()) {
//			System.out.println(obj.next());
//		}
//==============================================================
//		for (int i = 0; i < list.size(); i++) { 		// for方法
//			System.out.println(list.get(i));
//		}
//==============================================================	
//		for (Object obj : list) { // 				    //for each方法
//			System.out.println(obj);
//		}

//	• 移除不是java.lang.Number相關的物件
		Iterator<?> obj1 = list.iterator();
		while (obj1.hasNext()) {
			if (!(obj1.next() instanceof Number)) {
				obj1.remove();
			}

//	• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		}
		Iterator<?> obj = list.iterator(); //
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}

	}
}
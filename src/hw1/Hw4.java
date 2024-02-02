package hw1;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//	    有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)
//		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		int sum = 0;
//		for (int a = 0; a < array.length; a++)
//			sum += array[a];
//
//		int avg = (sum / array.length);
//		System.out.println("平均值:" + avg);
//
//		System.out.print("大於平均的數字:");
//		for (int a = 0; a < array.length; a++)
//
//			if (array[a] > avg) {
//				System.out.print(+array[a] + " ");
//			}
//		System.out.println();
//============================================================================

//		• 請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列)
//		String m = "Hello World";
//		StringBuilder w = new StringBuilder(m).reverse();
//		System.out.println(w.toString());

//		String arrayH[] = { "H", "e", "l", "l","o", "", "W", "o", "r", "l", "d" };
//		for (int j = arrayH.length-1; j >= 0 ; j--) {
//			System.out.print(arrayH[j]);
//		}
//		System.out.println();

//============================================================================

//		• 有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”
//		, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示：字元比對，String方法)
//		String planet[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

//		int sum = 0;
//		for (int a = 0; a < planet.length; a++) { // 外圈 取planet陣列長度
//			for (int b = 0; b < planet[a].length(); b++) { // 內圈 取陣列第b個字串的長度
//				if (planet[a].charAt(b) == 'a')
//					sum++;
//				else if (planet[a].charAt(b) == 'e')
//					sum++;
//				else if (planet[a].charAt(b) == 'i')
//					sum++;
//				else if (planet[a].charAt(b) == 'o')
//					sum++;
//				else if (planet[a].charAt(b) == 'u')
//					sum++;
//			}
//		}
//		System.out.println("總共有" + sum);
//============================================================================
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//		表如下：
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「
//		有錢可借的員工編號: 25 19 27 共3 人!」
//		(提示：Scanner，二維陣列)
//		員工編號  25  32   8   19   27
//		身上現金 3200 800 500 1000 1200

//		System.out.println("輸入想要借的金額");
//		int num = in.nextInt();
//		
//		int count = 0;
//		int money[][] = { { 25, 32, 8, 19, 27 }, { 3200, 800, 500, 1000, 1200 } };
//		for (int i = 0; i < money[0].length; i++) {
//			if (num <= money[1][i]) {
//				System.out.print(money[0][i] + "  ");
//				count++;
//			}
//
//		}
//		System.out.println("共" + count + "人");

//============================================================================		
//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
//		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		int day;
//
//		System.out.println("輸入西元年分");
//		int year = in.nextInt();
//		System.out.println("月份");
//		int month = in.nextInt();
//
//		if (month != 2) {
//			System.out.println("日期");
//			day = in.nextInt();
//		} else {
//			System.out.println("日期");
//			while (true) {
//
//				day = in.nextInt();
//
//				if (day > 28) {
//					System.out.println("重新輸入，2月不會大於29天");
//				} else {
//					break;
//				}
//			}
//		}
//		int count = 0;
//		for (int i = 0; i < month - 1; i++) {
//			count += days[i];
//		}
//		count += day;
//		if (month > 2) {
//			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//				count += 1;
//			}
//		}
//		System.out.println(count + "天");

//============================================================================		
//		班上有8位同學，他們進行了6次考試結果如下：
//		請算出每位同學考最高分的次數
//		(提示：二維陣列)
		
		int ex[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 }, };
		
		int count;
		int[] student = new int[8];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				count = 0;
				for (int u = 0; u < 8; u++) {
					if (ex[i][j] > ex[i][u]) {
						count = count + 1;
						if (count == 7) {
//							int a = j;
							student[j] += 1;
						}
					}
				}

			}

		}
		for (int i=0 ; i<8 ;i++) {
		System.out.println(i+1+"號"+ student[i]+"次");
		}
		
		in.close();
	}

}

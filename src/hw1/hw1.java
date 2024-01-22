package hw1;

public class hw1 {

	public static void main(String[] args) {
		// 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 12, b = 6;

		System.out.println("12+6=" + (a + b));
		System.out.println("12*6=" + a * b);

		// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆

		int egg = 200;
		int doz = 200 / 12;
		int many = egg % 12;

		System.out.println("200顆蛋共是" + doz + "打" + many + "顆");

//				請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int all = 256559;

		int day = all / (24 * 60 * 60);
		int sec1 = all % (24 * 60 * 60);
		int hour = sec1 / (60 * 60);
		int sec2 = sec1 % (60 * 60);
		int min = sec2 / 60;
		int sec = sec2 % 60;

		System.out.println(day + "天" + hour + "小時" + min + "分鐘" + sec + "秒");

//				請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

		double pi = 3.1415;
		int r = 5;
//				
//				System.out.println("周長="+(r+r)*pi);
//				System.out.println("面積="+Math.pow(r,2)*pi);

		System.out.printf("周長=%.2f%n", +(r + r) * pi);
		System.out.printf("面積=%.2f%n", Math.pow(r, 2) * pi);

//				某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//				金加利息共有多少錢 (用複利計算，公式請自行google
//				本利和 = 本金 × (1 + 年利率)^期間

		int y, money = 1500000;
		double rate = 0.02;
		double total = money * (1 + rate);
//		double total2 = money * Math.pow((1 + rate), 10);
//		System.out.println("10年本金加利息有"+(int)total2+"元");

		for (y = 1; y < 10; y++) {
			total *= (1 + rate);
		}
		System.out.println("10年總共有" + (int) total + "元");

//				請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//				5 + 5
//				5 + ‘5’
//				5 + “5”
//				並請用註解各別說明答案的產生原

		System.out.println(5 + 5); // 兩個同為整數，故直接相加
		System.out.println(5 + '5'); // 單引號裡的東西被視為字元char，找到5字符的Uncicode碼為0035，將十六進制轉為十進制，得到53+5=58
		System.out.println(5 + "5");// 雙引號裡的東西被視為字串String，字串和整數相加，系統會將左邊的5也轉為字串變成串起來，故5和5連接起來變成55

//		• 請建立一個TestNineNine.java程式,可輸出九九乘法表
//		• 一:使用for迴圈 + while迴圈
//		• 二:使用for迴圈 + do while迴圈
//		• 三:使用while迴圈 + do while迴圈

//		
// 使用for迴圈 + while迴圈
//		int i;
//		for (i = 2; i <= 9; i++) {
//			int j = 1;
//			while (j < 10) {
//				System.out.println(i + "*" + j + "=" + i * j);
//				j++;
//			}
//		}

// for迴圈 + do while迴圈
//		int i, j;
//		for (i = 2; i < 10; i++) {
//			j = 1;
//			do {
//				System.out.println(i + "*" + j + "=" + i * j);
//				j++;
//			} while (j < 10);
//
//		}

//使用while迴圈 + do while迴圈
//		int i, j;
//		i = 1;
//
//		while (i++ < 9) {
//			j = 1;
//			do {
//				System.out.println(i + "*" + j + "=" + i * j);
//				j++;
//			} while (j < 10);
//
//		}

	}
}

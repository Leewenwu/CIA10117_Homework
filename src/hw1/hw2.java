package hw1;

public class hw2 {

	public static void main(String[] args) {

//		• 請建立一個TestNineNine.java程式,可輸出九九乘法表

// 		使用for迴圈 + while迴圈
//		int i;
//		for (i = 2; i < 10; i++) {
//			int j = 1;
//			while (j < 10) {
//				System.out.println(i + "*" + j + "=" + i * j);
//				j++;
//			}
//		}

//		for迴圈 + do while迴圈
//		int i, j;
//		for (i = 2; i < 10; i++) {
//			j = 1;
//			do {
//				System.out.println(i + "*" + j + "=" + i * j);
//				j++;
//			} while (j < 10);
//
//		}

//		使用while迴圈 + do while迴圈 
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

//		請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
//		int sum = 0;
//		for (int a = 0; a <= 1000; a++) {
//			if (a % 2 == 0) {
//				sum += a;
//			}
//		}
//		System.out.println(sum);

//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
//		int sum1 = 1;
//		for (int a = 1; a <= 10; a++) {
//
//			sum1 = sum1 * a;
//
//		}
//
//		System.out.println(sum1);

//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
//		int sum2 = 1;
//		int a = 0;
//		while (a++ < 10) {
//			sum2 = sum2 * a;
//
//		}
//		System.out.println(sum2);

//	    請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
//		for (int a = 1; a <= 10; a++) {
//
//			for (int b = 1; b <= 10; b++)
//				if (a == b) {
//					System.out.println(a * b);
//				}
//
//		}

//		• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

//		int count = 0;
//		for (int a = 1; a <= 49; a++) {
//		
//			if (a % 10 == 4 || a / 10 == 4) {
//				continue;
//			}
//	
//				System.out.println(a );
//				count ++;
//			}
//		System.out.println(count+"次");

//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6 
//		1 2 3 4 5
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1
//		int n = 10; 
//
//		for (int i = n; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println(); 
//		}

//		• 請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				char ch = (char) ('@' + i );
				System.out.print(ch + "");
			}
			System.out.println();
		}

	}
}

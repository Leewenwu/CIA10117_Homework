package hw1;

import java.util.Scanner;

public class Hw3adv {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

//==========================================================
//		•請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形，如圖示結果：
//		(提示：Scanner，三角形成立條件，判斷式if else)
//		(進階功能：加入直角三角形的判斷)

//		System.out.println("請輸入三個數字");
//		int a = in.nextInt();
//
//		int b = in.nextInt();
//
//		int c = in.nextInt();
//		System.out.println(a + " " + b + " " + c);
//
//		if (a + b > c && a + c > b && b + c > a) {
//
//
//			if (a == b && b == c) {
//				System.out.println("正三角形");
//			} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
//
//				System.out.println("直角三角形");
//
//			} else if (a == b || b == c || a == c) {
//				System.err.println("等腰三角形");
//			} else {
//				System.out.println("只是三角形");
//			}
//		} else
//			System.out.println("這不是三角形");
//		else if ((a>b &&a> c)||(b>a &&b> c)||(c>b &&c> b)) 

//=================================================================
//		•請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息，如圖示結果：
//		(提示：Scanner，亂數方法，無窮迴圈)
//		(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
//		

//		System.out.println("猜數字");
//		System.out.println("請輸入0~100的數字");
//
//		int max = 100, min = 0;
//
//		int ran = (int) (Math.random() * max - min) + 1;
//
//		while (true) {
//			int num = in.nextInt();
//			if (num > 100) {
//				System.out.println("無效範圍!!");
//			} else if (num > ran) {
//
//				max = num;
//				System.out.println("錯了,請輸入" + min + "~" + max);
//			} else if (num < ran) {
//
//				min = num;
//				System.out.println("錯了,請輸入" + num + "~" + max);
//			} else {
//				System.out.println("答對了是" + ran);
//				break;
//
//			}
//		}

//==========================================================================
//	•阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數，如圖：
//		(提示：Scanner)
//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
//
		System.out.println("請輸入1~9討厭的數字");
		int num = in.nextInt();

		int count = 0;

		for (int a = 1; a <= 49; a++) {

			if (a % 10 == num || a / 10 == num) {
				continue;
			}

			count++;
			System.out.println(a);

		}
		System.out.println("共" + count + "個數字");
		System.out.println("印出6個號碼");

		int[] data = new int[6];

		for (int b = 0; b < data.length; b++) {
			do {
				data[b] = (int) (Math.random() * 49) + 1;
//			for (int c = 0; c < b; c++) {
				int ten = data[b] / 10;
				int one = data[b] % 10;

				if (ten == num || one == num || data[b] == num) {
					continue;
				}

				break;

			} while (true);

		}

		for (int d = 0; d < 6; d++) {
			System.out.println(data[d]);
		}

	}
}

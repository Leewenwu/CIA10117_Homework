package hw1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw6_CalTest {

	public static void main(String[] args) {
//		請設計三個類別Calculator.java
//				  CalException.java
//				  CalTest.java
//		在Calculator.java裡有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。
//		CalTest.java執行後，使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//		1. x與y同時為0，(產生自訂的CalException例外物件)
//		2. y為負值，而導致x的y次方結果不為整數
//		3. x與y皆正確情況下，會顯示運算後結

		Scanner in = new Scanner(System.in);
		try {
		System.out.print("請輸入X值:");
		int x = in.nextInt();
		System.out.print("請輸入Y值:");
		int y = in.nextInt();
		Hw6_Calculator mysum = new Hw6_Calculator();
	
			if (y >= 0 & x >= 0) {
				System.out.println(mysum.powerXY(x, y));
			} else {
				System.out.println("次方為負值，結果回傳不為整數!");
			}

		} catch (InputMismatchException a) {
			System.out.println("輸入格式不正確!");
		} catch (Hw6_CalException b) {
			System.out.println(b.getMessage());
		} catch (Exception c) {
			System.out.println(c.getMessage());
		}

		in.close();
	}

}

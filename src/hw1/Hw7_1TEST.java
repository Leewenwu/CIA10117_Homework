package hw1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1TEST {

	public static void main(String[] args) {
//		請自行建立一個文字檔Sample.txt，內容如檔案
//		請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		int a;
		String t;
		int by = 0;
		int c = 0;
		int ch = 0;
		int l = 0;
		try {

			FileReader txt = new FileReader("c:\\javawork\\Sample.txt");
			BufferedReader br = new BufferedReader(txt);
//			while ((a = br.read()) != -1) {
//				ch++;} // 每回傳一次 加一次字元
			System.out.println(ch);  // 正確?547
//				System.out.print((char) a); /* 輸出文字內容 */
			while ((t = br.readLine()) != null) {
//			System.out.println(t); 			/* 輸出文字內容 */
				by += t.getBytes().length; // 不完整 1405
				c += t.length(); // 不完整 526
				l++; // 11行
			}
			br.close();
			txt.close();
		} catch (IOException i) {
		}

//----------------------------------------------------

		File myf = new File("c:\\javawork\\Sample.txt");
		long b = myf.length();// 正確1426
		System.out.println("Sample.txt檔案共有" + by + "位元組" + "" + c + "字元" + "" + l + "列資料");

	}
}

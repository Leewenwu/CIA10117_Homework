package hw1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Hw7_1 {

	public static void main(String[] args) {
//		請自行建立一個文字檔Sample.txt，內容如檔案
//		請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		try {

			File file = new File("c:\\javawork\\Sample.txt");// 計算位元組
			long size = file.length();
//			System.out.println(size);

			FileReader txt = new FileReader("c:\\javawork\\Sample.txt");// 計算字元
			BufferedReader br = new BufferedReader(txt);
			long chcount = 0;
			int ch;
			while ((ch = br.read()) != -1) {
//				System.out.print((char)ch);
				chcount++;
			}
//			System.out.println(chcount);
			br.close();
			txt.close();

			int line = 0;
			File file1 = new File("c:\\javawork\\Sample.txt"); // 計算行數
			Scanner sc = new Scanner(file1);
			while (sc.hasNextLine()) {
				sc.nextLine();
				line++;
			}
			sc.close();
			FileReader txt1 = new FileReader("c:\\javawork\\Sample.txt");// 方法2 計算行數
			BufferedReader br1 = new BufferedReader(txt1);
			while ((br1.readLine()) != null) {
			}
			br1.close();
			txt1.close();

			System.out.println("Sample.txt檔案共有" + size + "個位元組" + chcount + "個字元" + line+"列資料");
		} catch (IOException e) {
		}
	}

}

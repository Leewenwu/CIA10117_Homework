package hw1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw7_2 {

	public static void main(String[] args) {
//		請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
//		(請使用append功能讓每次執行結果都能被保存起來)
		List<Integer> list = new ArrayList<Integer>();

		try {
			FileWriter fw = new FileWriter("C:\\CIA101_Workspace\\CIA10117_Homework\\src\\hw1\\Data.txt", true);

			BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter pw = new PrintWriter(bw);

			while (list.size() != 10) {
				int num = (int) (Math.random() * 1000) + 1;

				list.add(num);

			}

			Iterator<Integer> objs = list.iterator();
			while (objs.hasNext()) {
				pw.print(objs.next() + " ");

			}
			pw.println();

			System.out.println("輸出Data.txt成功!");

			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}

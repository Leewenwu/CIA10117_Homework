package hw1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hw7_3 {
//		請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案

	public static void main(String[] args) {
//		String oldFilename = "origin.txt";
//		String newFilename = "copy.txt";
		copyFile("origin.txt","copy.txt");
	}

	public static void copyFile(String oldFilename, String newFilename) {
		File oldFile = new File(oldFilename);
		File newFile = new File(newFilename);
		try {
			FileReader in = new FileReader(oldFile);
			FileWriter out = new FileWriter(newFile);
			int i;
			while ((i = in.read()) != -1) {
				out.write(i);
				System.out.print((char) i);
				System.out.flush();

			}
			System.out.println();
			System.out.println("複製成功!");
			out.close();
			in.close();
		} catch (IOException e) {
		}
	}

}

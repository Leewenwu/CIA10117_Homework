package hw1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Hw7_4 {
//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
//	承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
//	型簡化本題的程式設計)

	public static void main(String[] args) throws Exception {
		File pathex = new File("C:\\data");
		File file = new File("C:\\data\\object.ser");
		if (pathex.exists() == false) {
			pathex.mkdir();
		}
		
//		Hw7_Animal animal[] = new Hw7_Animal[4];
//		animal[0] = new Dog("小白");
//		animal[1] = new Dog("二哈");
//		animal[2] = new Cat("破貓");
//		animal[3] = new Cat("蕾蕾");
//=====================================
//		Dog dog = new Dog("燒餅");
//		Dog dog1 = new Dog("小黑");
//		Cat cat = new Cat("燒賣");
//		Cat cat1 = new Cat("大橘為重");
//=====================================		
//以下輸出
//		FileOutputStream fos = new FileOutputStream(file);
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		for (int i = 0 ; i<animal.length;i++) {
//			oos.writeObject(animal[i]);
//		}
//==============================
//		oos.writeObject(dog);
//		oos.writeObject(dog1);
//		oos.writeObject(cat);
//		oos.writeObject(cat1);
//==============================	
//		oos.close();
//		fos.close();
		
		
//以下輸入
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "的內容:");
		try {
			while (true) {
			((Hw7_Animal) ois.readObject()).speak();
//				((Dog) ois.readObject()).speak();
//				((Dog) ois.readObject()).speak();
//				((Cat) ois.readObject()).speak();
//				((Cat) ois.readObject()).speak();
			}
		}

		catch (IOException e) {
		}
		System.out.println("讀取結束!");
		ois.close();
		fis.close();

	}

}
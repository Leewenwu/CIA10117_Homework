package hw1;

public class Hw5_MyRectangleMain {

	public static void main(String[] args) {

// 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		Hw5_MyRectangle my1 = new Hw5_MyRectangle();
		my1.setDepth(10);
		my1.setWidth(20);
		System.out.println(my1.getArea());

		
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果		
		Hw5_MyRectangle my2 = new Hw5_MyRectangle(10, 20);
		System.out.println(my2.getArea());

	}

}

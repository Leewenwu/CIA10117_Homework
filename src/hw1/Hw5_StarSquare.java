package hw1;

public class Hw5_StarSquare {

	public void starSquare(int width, int high) {

		for (int h = 0; h < high; h++) {
			for (int w = 0; w < width; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
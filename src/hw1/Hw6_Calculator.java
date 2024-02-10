package hw1;

public class Hw6_Calculator {

	public int powerXY(int x, int y) throws Hw6_CalException {

		int res;

		res = (int) Math.pow(x, y);
		if (x == 0 && y == 0) {
			throw new Hw6_CalException("xy不能都為0!");
		} else {
			return res;
		}
	}
}

package hw1;

public class Hw5_GenAuthCode {

	public void genAuthCode() {

		int[] code = new int[8];
		int ran;
		for (int i = 0; i < code.length; i++) {
			while (true) {
				ran = (int) (Math.random() * 75) + 48;

				if ((47 < ran && ran < 58) || (64 < ran && ran < 91) || (96 < ran && ran < 123)) {
					code[i] = ran;
					System.out.print((char) code[i]);
					break;
				}
				
			}

		}

	}
}
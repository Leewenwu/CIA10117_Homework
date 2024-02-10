package hw1;

public class Hw5_RandAvg {

	public void randAvg() {
		int avg ;
		int sum =  0 ;
		for (int i = 0; i < 10; i++) {
			int ran = (int) (Math.random() * 101);
			System.out.print(ran+" ");
			sum +=ran;
			
		}
		avg = sum/10;
		System.out.println();
		System.out.print(avg);
	}

}

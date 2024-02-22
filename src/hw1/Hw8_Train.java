package hw1;

import java.util.Objects;

public class Hw8_Train implements Comparable<Hw8_Train> {
//	• 請設計一個Train類別，並包含以下屬性：
//	  班次number，型別為int  
//	  車種type，型別為String  
//	  出發地start，型別為String
//	  目的地dest，型別為String  
//	  票價price，型別為double
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Hw8_Train(int number, String type, String start, String dest, double price) {

		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return number + "-" + type + "-" + start + "-" + dest + "-" + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hw8_Train other = (Hw8_Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public int compareTo(Hw8_Train Tnumber) {
		if (this.number < Tnumber.number) {
			return 1;
		} else if (this.number == Tnumber.number) {

			return 0;
		}
		else {
			return -1;
		}

	}

}

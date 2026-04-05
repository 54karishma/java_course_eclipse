package _09_03_26;

public class Divisibility {
	public  boolean isDivisibleBy(int num) {
		if(num%5==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Divisibility d=new Divisibility();
		System.out.println("Is 15 divisible by 5 ?" +d.isDivisibleBy(15));
	}

}


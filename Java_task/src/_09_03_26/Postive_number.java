package _09_03_26;

public class Postive_number {
	public String checkNumber(int num) {
		if (num>0) {
			return "postive";
		}
		if(num<0) {
			return "negative";
		} 
		return "zero";
	}
	public static void main(String [] args) {
		Postive_number p= new Postive_number();
		System.out.println("check -5:" +p.checkNumber(-5));
	}

}
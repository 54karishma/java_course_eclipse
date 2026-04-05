package _09_03_26_if_else;

public class Even_odd {
	public void isEven(int num) {
		if (num%2==0) {
			System.out.println(  " 20 is  even number");
			
		}
		else {
			System.out.println(" 20 is odd number");
		}
	}
	public static void main(String [ ] args) {
		Even_odd e=new Even_odd();
		e.isEven(20);
		
		
	}

}

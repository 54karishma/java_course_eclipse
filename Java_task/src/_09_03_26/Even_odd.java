package _09_03_26;

public class Even_odd {
	public boolean isEven(int num) {
		if (num %2==0) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		Even_odd e= new Even_odd();
		System.out.println("Is 10 even? " +e.isEven(10));
		
	}
	
}


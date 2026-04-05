package _25_2_26;

public class static_method_task8 {
	public static int x=10;
	public static int y=20;
	public static void swap() {
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println(x);
		System.out.println(y);
	
	}
	public static void main(String [] args) {
		swap();
	}

}

package _25_2_26;

public class static_method_task6 {
	public static int a=10;
	public static int b=4;
	public static void multiply() {
		System.out.println("multiplication:" +(a*b));
	}
	public static void showResult() {
		multiply();
		System.out.println("calculation done");
	}
	public static void main(String [] args) {
		showResult();
	}

}

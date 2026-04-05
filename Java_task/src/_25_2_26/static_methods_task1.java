package _25_2_26;

public class static_methods_task1 {
	public static int a=20;
	public static int b=30;
	public static void sum() {
		System.out.println("sum:" + (a+b));
	}
	public static void average() {
		sum();
		System.out.println("average:" +(a+b)/2);
	}
	public static void main(String [] args) {
		average();
	}

}

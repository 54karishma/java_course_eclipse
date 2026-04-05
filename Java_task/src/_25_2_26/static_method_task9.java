package _25_2_26;

public class static_method_task9 {
	public static int num=5;
	public static void square() {
		System.out.println("square :"+(num*num));
	}
	public static void cube() {
		square();
		System.out.println("cube:"+(num*num*num));
	}
	public static void main(String[] args) {
		cube();
		
	}

}

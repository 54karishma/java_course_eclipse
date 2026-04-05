package _25_2_26;

public class static_methods_task2 {
	public static int radius=5;
	public static void area() {
		double a=3.14*radius*radius;
		System.out.println("area :"+ a);
	}
	public static void perimeter() {
		double p=2*3.14*radius;
		System.out.println("perimeter:" +p);
	}
	public static void main(String[] args) {
		area();
		perimeter();
		
	}

}

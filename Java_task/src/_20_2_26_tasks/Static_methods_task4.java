package _20_2_26_tasks;

public class Static_methods_task4 {
	public static void cab(String name,int distance) {    //cab fare calculator
		int fare=5*distance;
		System.out.println(name);
		System.out.println(distance);
		System.out.println("total fare:"+fare);
		
	}
	public static void main(String [] args) {
		cab("karishma",50);
	}

}

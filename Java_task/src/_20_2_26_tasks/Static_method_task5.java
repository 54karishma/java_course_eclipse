package _20_2_26_tasks;

public class Static_method_task5 {
	public static void print(String name,int units) {
		int bill=units*50;
		System.out.println("customer name:" +name);
		System.out.println("units :"+units);
		System.out.println("Electricity bill:"+bill);
	}
	public static void main(String [] args) {
		print("karishma",5);
	}

}

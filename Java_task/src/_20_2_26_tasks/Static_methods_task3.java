package _20_2_26_tasks;

public class Static_methods_task3 {
	public static void calculator(String name,int a,int b,int c) {
		int total=a+b+c;
		int percentage=(total*100)/300;
		System.out.println("total marks :"+total);
		System.out.println("total percentage:" +percentage);
		
	}
	public static void main(String [] args) {
		calculator("karishma",89,90,99);
	}

}

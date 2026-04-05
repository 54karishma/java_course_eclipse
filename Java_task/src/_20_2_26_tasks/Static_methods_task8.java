package _20_2_26_tasks;

public class Static_methods_task8 {
	public static void mobile(String name,int ud,int data) {
		System.out.println("customer name:" +name);
		System.out.println("Used data:"+ud);
		System.out.println("total data :" +data);
		System.out.println("the user used 1Gb out of 2Gb");
	}
	public static void main(String [] args) {
		mobile("karishma",1,2);
	}

}

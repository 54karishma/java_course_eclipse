package _20_2_26_tasks;

public class Static_methods_task2 {
	public static void food(String item,int quantity,int price) {  //online food bill generator
		System.out.println("item name:"+item);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		int bill=quantity*price;
		System.out.println("Total bill:"+bill);
			
	}
	public static void main(String [] args) {
		food("gobi",2,70);
		
	}

}

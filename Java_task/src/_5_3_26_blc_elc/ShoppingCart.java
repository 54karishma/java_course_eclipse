package _5_3_26_blc_elc;

public class ShoppingCart {
	public static void main(String[] args) {
		product p1 = new product();
		product p2=new product();
		p1.setId(1);
		p1.setName("iphone");
		p1.setPrice(100000.0);
		p1.setQuantity(2);
		System.out.println ("-----object1------");
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getQuantity());
		p1.setQuantity(5);
		System.out.println("updated Quantity:" +p1.getQuantity());
		p2.setId(2);
		p2.setName("watch");
		p2.setPrice(10000.0);
		p2.setQuantity(4);
		System.out.println(" -------object2-----");
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getPrice());
		System.out.println(p2.getQuantity());
		p2.setQuantity(10);
		System.out.println("updated Quantity:" +p2.getQuantity());
	}

}

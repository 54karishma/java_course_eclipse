package _5_3_26_blc_elc;

public class CarRentalServices {

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		c1.setId(333);
		c1.setBrand("Maruti Suzuki");
		c1.setModel("Swift");
		c1.setPrice(600000.0);
		System.out.println("car1 id:" +c1.getId());
		System.out.println("car1 Brand:" +c1.getBrand());
		System.out.println("car1 Model:" +c1.getModel());
		System.out.println("car1 Price:" +c1.getPrice());
		System.out.println(" ");
		c2.setId(444);
		c2.setBrand("Creta ");
		c2.setModel("Hyundai");
		c2.setPrice(1100000.0);
		System.out.println("car2 id:" +c1.getId());
		System.out.println("car2 Brand:" +c1.getBrand());
		System.out.println("car2 Model:" +c1.getModel());
		System.out.println("car2 Price:" +c1.getPrice());
		

	}

}

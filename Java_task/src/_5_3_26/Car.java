package _5_3_26;

public class Car {

		String carBrand;
		String carModel;
		int carPrice;
		
	   public void addCarDetails(String brand,String  model,int price) {
		   carBrand=brand;
		   carModel=model;
		   carPrice=price;
		   
		   
	   }
	   public String displayCarDetails() {
		   return "carBrand: "+carBrand+ "  carModel:" +carModel+ "  carPrice:" +carPrice;
	   }
	   public static void main(String args[]) {
		   Car c=new Car();
		   c.addCarDetails("bmw", "bmw 2.0 series", 1000000);
		   System.out.println(c.displayCarDetails());
	   }
	}




package _28_2_26;

public class Car {
	public String carMake;
	public String carModel;
	public int ManufacturingYear;
	public void addCarDetails(String carMake,String carModel,int ManufacturingYear) {
		this.carMake=carMake;
		this.carModel=carModel;
		this.ManufacturingYear=ManufacturingYear;
			
	}
	public void displayDetails() {
		System.out.println(carMake);
		System.out.println(carModel);
		System.out.println(ManufacturingYear);
		
	}
	public static void main(String [] args) {
		Car c=new Car();
		c.addCarDetails("BMW", "BMW 2 series", 2010);
		c.displayDetails();
		
	}
}

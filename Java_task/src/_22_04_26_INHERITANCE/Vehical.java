package _22_04_26_INHERITANCE;

public class Vehical {
	String make;
	String model;
	int year;
	Vehical(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public  void displayInfo() {
		System.out.println("Make is" +make);
		System.out.println("model is:"+model);
		System.out.println("year is:"+year);
	}
	
	public static void main(String[] args) {
		Vehical car=new Car("Toyota","Corolla",2022,4);
		car.displayInfo();
		((Car)car).displayCarInfo();
		
		Vehical truck=new Truck("Ford","F-150",2021,1000);
		truck.displayInfo();
		((Truck)truck).displayTructInfo();
		
		
		Vehical m=new Motorcycle("Harley","StreetGlide",2024,70);
		m.displayInfo();
		((Motorcycle)m).displayMotorcycleInfo();
	}

}
class Car extends Vehical{
	
	int numberOfDoors;
	Car(String make,String model,int year,int numberOfDoors){
		super(make,model,year);
		this.numberOfDoors=numberOfDoors;
		
	}
	public void displayCarInfo() {
		System.out.println("numberOfDoors is:"+numberOfDoors);
	}
	
}
class Truck extends Vehical{
	int cargoCapacity;
	Truck(String make,String model,int year,int cargoCapacity){
		super(make,model,year);
		this.cargoCapacity=cargoCapacity;
		
	}
	public void displayTructInfo() {
		System.out.println("truck cargo capacity is:"+cargoCapacity);
	}
}
class Motorcycle extends Vehical{
	int hasSidecar;
	Motorcycle(String make,String model,int year,int hasSidecar){
		super(make,model,year);
		this.hasSidecar=hasSidecar;
		
	}
	public void displayMotorcycleInfo() {
		System.out.println("motor cycle details:" +hasSidecar);
	}
} 

package exam;

public abstract class ServiceVehicle extends Vehicle{

	public ServiceVehicle(String ownerName, String number, String type) {
		super(ownerName, number, type);
		System.out.println("vehicle profile created sussfully");
		
		
	}
    public void updateServiceCategory() {
    	System.out.println("service category is: Metro Motors");
    	
	
}
    public void updateServiceCenter() {
    	System.out.println("service center name is : General Services");
    	
    	
    }
    public void displayProfile() {
    	System.out.println("Enter owner Name:" +getownerName());
    	System.out.println("Enter vehicle number:" +getnumber());
    	System.out.println("Enter vehicle type :"+gettype());
    	
    	
    	
    }
    
    

	
	

}

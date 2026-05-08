package exam;

public  class ServiceVehicle extends Vehicle implements ServiceOperation{

	public ServiceVehicle(String ownerName, String number, String type) {
		super(ownerName,number,type);
		System.out.println("vehicle profile created sussfully");
		
		
	}
    public void updateServiceCategory() {
    	System.out.println("service category is: Metro Motors");
    	
	
}
    public void updateServiceCenter() {
    	System.out.println("service center name is : General Services");
    	
    	
    }
    @Override
    public void displayProfile() {
    	System.out.println("Enter owner Name:" +getownerName());
    	System.out.println("Enter vehicle number:" +getnumber());
        System.out.println("Enter vehicle type :"+gettype());
        
        
        
    }
}
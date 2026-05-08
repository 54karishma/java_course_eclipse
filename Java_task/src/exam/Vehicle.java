package exam;

public abstract class  Vehicle {
	private String ownerName;
	private String number;
	private String type; 
	public void setownerName(String ownerName) {
		this.ownerName=ownerName;
	}
	public String getownerName() {
		return ownerName;
	}
	public void setnumber(String number) {
		this.number=number;
	}
	public String getnumber() {
		return number;
	}
	public void settype(String type) {
		this.type=type;
	}
	public String gettype() {
		return type;
	}
	
	public Vehicle(String ownerName,String number,String type) {
		this.ownerName=ownerName;
		this.number=number;
		this.type=type;
	}
	public abstract void  displayprofile();
	public void displayProfile() {
		
		
	}
	
}


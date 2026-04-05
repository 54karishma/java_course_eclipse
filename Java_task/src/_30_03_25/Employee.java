package _30_03_25;

public class Employee {
	private int EmployeeID;
	private String Employeename;
	private String designation;
	private double EmployeeSalary;
	private int PerformanceRating;
	
	
	public Employee(int EmployeeId, String Employeename, String designation, double EmployeeSalary,int PerformanceRating) {
		this.EmployeeID=EmployeeID;
		this.Employeename=Employeename;
		this.designation=designation;
		this.EmployeeSalary=EmployeeSalary;
		this.PerformanceRating=PerformanceRating;
		
		
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public String getEmployeename() {
		return Employeename;
	}
	public String getdesignation() {
		return designation;
	}
	public double getEmployeeSalary() {
		return EmployeeSalary;
	}
	public int getPerformanceRating() {
		return PerformanceRating;
	}
	public void setEmployeeID(int EmployeeId) {
		this.EmployeeID=EmployeeID;

	}
	public void setEmployeename(String Employeename) {
		this.Employeename=Employeename;
		
	}
	public void setdesignation(String designation) {
		
	}
	

}

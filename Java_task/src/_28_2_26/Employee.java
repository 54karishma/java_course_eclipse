package _28_2_26;

public class Employee {
	public  String employeeName;
	public  int employeeId;
	public  double employeeSalary;
	
	public  void addEmployeeDetails(String name,int id,double salary) {
		employeeName=name;
		employeeId=id;
		employeeSalary=salary;
		
	}
	public void displayDetails() {
		System.out.println("employee name"+employeeName);
		System.out.println("employee id:"+employeeId);
		System.out.println("employee salary:"+employeeSalary);
	}
	public  static void main(String [] args) {
		Employee emp=new Employee();
		emp.addEmployeeDetails("karishma",25,50000);
		emp.displayDetails();
	}
}

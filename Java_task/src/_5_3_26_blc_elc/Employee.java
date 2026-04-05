package _5_3_26_blc_elc;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	public void setId(int id) {
		employeeId=id;
		
	}
	public void setName(String name) {
		employeeName=name;
	}
	public void setSalary(double sal) {
		salary=sal;
		
	}
	public int getId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
	 public void employeeDetails() {
		 System.out.println("employee Id:"+employeeId);
		 System.out.println("employee Name:" +employeeName);
		 System.out.println("employee salary:" +salary);
	 }

}

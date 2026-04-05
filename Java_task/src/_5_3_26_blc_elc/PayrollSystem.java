package _5_3_26_blc_elc;

public class PayrollSystem {
	public static void main(String [] args) {
		Employee e=new Employee();
		e.setId(111);
		e.setName("karishma");
		e.setSalary(50000);
		e.employeeDetails();
		e.setSalary(80000);
		System.out.println("updated salary:" +e.getSalary());
		
	}

}

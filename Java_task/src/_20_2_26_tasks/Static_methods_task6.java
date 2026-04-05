package _20_2_26_tasks;

public class Static_methods_task6 {
	public static void emp(String name,int salary) {
		int cut=(salary*10)/100;
		int final_salary=salary-cut;
		System.out.println("employee name:"+name);
		System.out.println("salary is:" +final_salary);
	}
	public static void main(String [] args) {
		emp("karishma",50000);
	}

}

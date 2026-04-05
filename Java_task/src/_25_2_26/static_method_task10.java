package _25_2_26;

public class static_method_task10 {
	public static int studentCount=0;
	public static void addStudents(int n) {
		studentCount=studentCount+n;
		
	}
	public static void main(String [] args) {
		addStudents(15);
		addStudents(5);
		addStudents(4);
		System.out.println("total count:"+studentCount);
	}

}

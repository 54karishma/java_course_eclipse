package _5_3_26;

public class Student {
	String studentName;
	int studentId;
	int studentMarks;
	public void addStudentDetails(String name,int id, int marks) {
		studentName=name;
		studentId=id;
		studentMarks=marks;
		
	}
	public String displayStudentDetails() {
		return "studentName:" +studentName+ " studentId : " +studentId+ " studentMarks: " +studentMarks;
		
		
	}
	public static void main(String [] args) {
		Student s= new Student();
		s.addStudentDetails("karishma", 256, 900);
		System.out.println(s.displayStudentDetails());

}
}
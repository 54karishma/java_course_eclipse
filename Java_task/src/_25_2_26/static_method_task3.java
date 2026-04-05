package _25_2_26;

public class static_method_task3 {
	public static int sub1=85;
	public static int sub2=90;
	public static int sub3=80;
	public static void totalMarks() {
		System.out.println("total marks:"+(sub1+sub2+sub3));
		
	}
	public static void averageMarks() {
		int avg=(sub1+sub2+sub3)/2;
		System.out.println("average marks:"+avg);
	}
	public static void main(String[] args) {
		totalMarks();
		averageMarks();
		
	}
	 

}

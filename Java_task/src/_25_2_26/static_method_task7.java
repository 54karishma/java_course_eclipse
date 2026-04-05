package _25_2_26;

public class static_method_task7 {
	public static int  marks1=78;
	public static int marks2=85;
	public static int marks3=90;
	public static int total() {
		//System.out.print("total:" +(marks1+marks2+marks3));
		return marks1+marks2+marks3;
	}
	public static void percentage() {
		total();
		System.out.println("percentage:" +(marks1+marks2+marks3)*100/300);
	}
	public static void main(String[] args) {
		percentage();
	}

}

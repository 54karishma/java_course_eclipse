package _09_03_26;

public class Greater_number {
	public int findGreater(int num1,int num2) {
		if(num1>num2) {
			return num1;
		}
		return num2;
	}

	public static void main(String [] args) {
		Greater_number g=new Greater_number();
		System.out.println("Greater number (10,25):" +g.findGreater(10,25));
	}
}
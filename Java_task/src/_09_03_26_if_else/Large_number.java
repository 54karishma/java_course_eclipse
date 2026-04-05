package _09_03_26_if_else;

public class Large_number {
	public void number(int a,int b,int c) {
		if (a>b&&a>c) {
			System.out.println("a is big");	
		}
		if(b>c)
		{
				System.out.println("b is big");
		}
		else
		{
			System.out.println("c is big");
		}
	}
		public static void main(String[] args)
		{
			Large_number obj=new Large_number();
			obj.number(10,20,5);
		}
}

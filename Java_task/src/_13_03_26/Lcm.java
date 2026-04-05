package _13_03_26;

public class Lcm {
	static int  lcm=0;
	public static void print(int a,int b) {
		
		for(int i=1;i<=a*b;i++) {
			if(i%a==0 && i%b==0) {
				lcm=i;
			}
		}
		System.out.println("lcm is:" +lcm);
		
	}

	public static void main(String[] args) {
		print(4,6);
	}

}

package _11_04_26_practise;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int r=num;
		int rem=0;
		while(num>0) {
			int ld=num%10;
			rem=rem*10+ld;
			num=num/10;
		}
		if(r==rem) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		
	}

}

package _5_3_26_blc_elc;

public class BankApplication {
	public static void main(String [] args) {
		Bankaccount b=new Bankaccount();
		b.setNumber(12345);
		b.setName("karishma");
		b.setBalance(5000.0);
		System.out.println("account number:" +b.getNumber());
		System.out.println("account holder name:" +b.getName());
		System.out.println("balance:" +b.getBalance());
		b.setBalance(6000);
		System.out.println("updated balance:" +b.getBalance());
	}
	
}

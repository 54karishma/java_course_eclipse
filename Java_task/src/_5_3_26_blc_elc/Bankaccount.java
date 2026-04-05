package _5_3_26_blc_elc;

public class Bankaccount {
	long accountNumber;
	String accountHolderName;
	double balance;
	public void setNumber(long number) {
		accountNumber=number;
		
	}
	public void setName(String name) {
		accountHolderName=name;
	}
	public void setBalance(double bal) {
		balance=bal;
	}
	public long getNumber() {
		return accountNumber;
	}
	public String getName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	

}


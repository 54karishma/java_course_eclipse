package _12_03_26_ladder_if;

public class Bank {
	public String checkLoanApproval(double salary,int creditScore) {
		if (salary >80000 && creditScore >750) {
			return "Loan Approved Immediately";
		}
		else if((salary>50000 && salary <=80000)&&(creditScore>650 && creditScore<=750) ) {
			return "Loan Approved with Higher Interest Rate";
		}
		else if((salary >30000 && salary <=50000) &&(creditScore>500 && creditScore<=650)) {
			return "Co-signer Required";
			
		}
		else {
			return "Loan Rejected";
		}
	}
	public static void main(String [] args) {
		Bank b=new Bank();
		System.out.println(b.checkLoanApproval(60000, 660));
		
		}
}
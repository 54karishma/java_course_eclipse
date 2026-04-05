package _09_03_26;

public class Vote {
	public boolean canVote(int age) {
		if(age>=18) {
			return true;
		}
		return false;
	}
	public static void main(String [] args) {
		Vote v=new Vote();
		System.out.println("can vote (Age 20)?:" +v.canVote(20));
	
	}

}
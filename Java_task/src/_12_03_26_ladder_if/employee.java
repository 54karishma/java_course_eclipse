package _12_03_26_ladder_if;

public class employee {
	public double calculateBonus(int experience,int rating,double salary) {
		if (experience >5 && rating >9) {
			return 0.5*salary;
		}
		else if((experience >3 && experience <=5) && (rating >7 && rating <=9)) {
			return 0.3*salary;
		}
		else if((experience >1 && experience <=3) && (rating >5 && rating <=7)) {
			return 0.1*salary;
		}
		else {
			return 0.0;
		}
	}
	public static void main(String [] args) {
		employee e=new employee();
		System.out.println(e.calculateBonus(5,8,50000));
	}

}

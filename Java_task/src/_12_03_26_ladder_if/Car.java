package _12_03_26_ladder_if;

public class Car {
	public String calculatePremium(int age,int experience) {
		if (age>50 && experience >10) {
			return "Lowest Premium";
		}
		else if((age >30 && age<=50)&&(experience>5)){
			return "Moderate Premium";
		}
		else if((age >18 && age <=30) && experience <=5) {
			return "highest Premium";
		}
		else {
			return "Not eligible for Insurance";
		}
	}
	
	public static void main(String []  args) {
		Car c=new Car();
		System.out.println(c.calculatePremium(60,11));
	}

}

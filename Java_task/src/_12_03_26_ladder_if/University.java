package _12_03_26_ladder_if;

public class University {
	public static String evaluateAdmission(int marks,boolean sportsAchievement) {
		if(marks> 95) {
			return "Admitted with Scholarship";
		}
		else if(marks>=85 && marks<=94) {
			return "Admitted without Scholarship";
			
		}
		else if((marks>=70 && marks <=84) && sportsAchievement) {
			return "Admitted under sports quota";
		}
		else if(marks>=60 && marks <=69) {
			return "Interview Reuired";
		}
		else {
			return "Admission Rejected";
		}
	}
	public static void main(String [] args) {
		System.out.println(evaluateAdmission(85,true));
	}

}
package _12_03_26_ladder_if;

public class Movie {
	public double  getTicketPrice(int age) {
		if ( age < 5) {
			return 0.0;
		}
		else if(age >=5 && age<=12) {
			return 5.0;
		}
		else if (age>13 && age <=60 ) {
			return 10.0;
		}
		else {
			return 0.5;
		}
	}
	public static void main(String [] args) {
		Movie m=new Movie();
		System.out.println(m.getTicketPrice(6));
	}

}


public class DayOfTheWeekChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 10;

		int day1 = day;

		printDayOfTheWeek(day);

		printDayOfTheWeek(day1, day);

	}

	public static void printDayOfTheWeek(int day) {

		switch(day) {

		case 1:

			System.out.println("Today is sunday");

			break;

		case 2:

			System.out.println("Today is monday");

			break;

		case 3:

			System.out.println("Today is tuesday");

			break;

		case 4:

			System.out.println("Today is wednesday");

			break;

		case 5:

			System.out.println("Today is thursday");

			break;

		case 6:

			System.out.println("Today is friday");

			break;

		case 7:

			System.out.println("Today is saturday");

			break;

		default:

			System.out.println("Invalid Day");

			break;

		}

	}
	
	public static void printDayOfTheWeek(int day1, int day) {
		
		if (day == 1) {
			
			System.out.println("Today is sunday");
			
		} else if (day == 2) {
			
			System.out.println("Today is monday");
			
		} else if (day == 3) {
			
			System.out.println("Today is tuesday");
			
		} else if (day == 4) {
			
			System.out.println("Today is wednesday");
			
		} else if (day == 5) {
			
			System.out.println("Today is thursday");
			
		} else if (day == 6) {
			
			System.out.println("Today is friday");
			
		} else if (day == 7) {
			
			System.out.println("Today is saturday");
			
		} else {
			
			System.out.println("Invalid Day");
			
		}
		
		
	}

}

public class A119_MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printYearsAndDays(525600);

	}
	
	
	public static void printYearsAndDays(long minutes) {
		
		if (minutes > -1) {
			
			int years = (int) minutes / 525600;
			
			int remainingMinutes = (int) minutes % 525600;
			
			int days = (int) remainingMinutes / 1440;
			
			
			
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
			
			
			
		} else { 
			
			System.out.println("Invalid Value");
		
		}
		
		
		
	}

}

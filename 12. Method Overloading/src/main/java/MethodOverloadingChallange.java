
public class MethodOverloadingChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double feet = 1;

		double inches = 9;

		double test = calcFeetAndInchesToCentimeters(feet, inches);
		
		calcFeetAndInchesToCentimeters(inches);
		
		System.out.println(test);

	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

		if (feet >= 0 && inches >= 0 && inches <= 12 ) {
			
			double inchesfromfeet = feet * 12;
			
			double totalinches = inchesfromfeet + inches;
			
			double centimeters = totalinches * 2.54;
			
			return centimeters;
			
		}
		
		return -1;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if (inches >= 0) {
			
			double feet = (int) inches / 12;
			
			return calcFeetAndInchesToCentimeters(feet, inches);
			
			
			
		}
		
		return -1;
		
	}

}

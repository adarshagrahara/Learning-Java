
public class Strings {

	public static void main(String[] args) {
		
		/* byte
		 * short
		 * integer
		 * long
		 * float
		 * double
		 * char
		 * boolean
		 */
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		
		myString = myString + ", and this is more";
		
		
		System.out.println("myString is equal to " + myString);
		
		myString = myString + " \u00A9 2019";
		
		System.out.println("myString is equal to " + myString);
		
		String numberSring = "100.65";
		
		numberSring = numberSring + "135.09";
		
		System.out.println(numberSring);
		
		int myInt = 50;
		
		String lastString = "25";
		
		double doubleNumber = 120.47d;
		
		lastString = lastString + doubleNumber;
		
		System.out.println("Last String is equal to " + lastString);
		
		
	}

}

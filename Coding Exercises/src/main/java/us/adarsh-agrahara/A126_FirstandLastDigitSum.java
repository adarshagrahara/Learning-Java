public class A126_FirstandLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 9876567;
		
		System.out.println(sumFirstAndLastDigit(number) + " is the sum of the first and last digit of " + number);

	}

	public static int sumFirstAndLastDigit(int number) {
		
		int lastdigits = number; 

		if (number >= 0) {

			int multiplier = 1;
			
			int sum = 0;
			

			int digits = String. valueOf(number).length();

			for(int i = 0; i < (digits - 1) ; i++) {

				multiplier *= 10;


			}

			number = number / multiplier;

			int lastDigit = 0;

	        int counter = 0;
	        
	        while (counter == 0) {
	            
	            lastDigit = lastdigits % 10;
	            
	            sum += lastDigit;
	            
	            
	            
	            
	            
	          break;
	        }
	        
	        return sum + number;
			
	        
	     
			



		}

		return -1;
	}

}

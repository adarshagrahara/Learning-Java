public class A129_LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 19;

		int number1 = 522;
		
		int number2 = 942;
		
		int charles = 8;

		System.out.println(hasSameLastDigit(number,number1,number2));

		System.out.println(isValid(charles));
	}

	public static boolean hasSameLastDigit(int number, int number1,int number2) {

		int lastdigits = number;

		int lastdigits1 = number1; 
		
		int lastdigits2 = number2; 

		if (number >= 10 && number <= 1000 && number1 >= 10 && number1 <= 1000 && number2 >= 10 && number2 <= 1000) {

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

			int multiplier1 = 1;

			int sum1 = 0;


			int digits1 = String. valueOf(number1).length();

			for(int i = 0; i < (digits1 - 1) ; i++) {

				multiplier1 *= 10;


			}

			number1 = number1 / multiplier1;

			int lastDigit1 = 0;

			int counter1 = 0;

			while (counter1 == 0) {

				lastDigit1 = lastdigits1 % 10;

				sum1 += lastDigit1;





				break;
			}
			
			int multiplier2 = 1;

			int sum2 = 0;


			int digits2 = String. valueOf(number2).length();

			for(int i = 0; i < (digits2 - 1) ; i++) {

				multiplier2 *= 10;


			}

			number2 = number2 / multiplier2;

			int lastDigit2 = 0;

			int counter2 = 0;

			while (counter2 == 0) {

				lastDigit2 = lastdigits2 % 10;

				sum2 += lastDigit2;





				break;
			}


			if(sum == sum1 || sum == sum2 || sum1 == sum2) {

				return true;

			}





		}

		return false;
	}
	
	public static boolean isValid(int charles) {
		
		if (charles >= 10 && charles <= 1000) {
			
			return true;
		}
		
		return false;
	}

}

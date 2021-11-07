public class A128_SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 15;

		int number1 = 75;

		System.out.println(hasSharedDigit(number,number1));

	}

	public static boolean hasSharedDigit(int number, int number1) {

		int lastdigits = number;

		int lastdigits1 = number1; 

		if (number >= 10 && number <= 99 && number1 >= 10 && number1 <= 99) {

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

			

			if(sum == sum1 || sum == number1 || number == sum1 || number == number1) {

				return true;

			}





		}

		return false;
	}

}

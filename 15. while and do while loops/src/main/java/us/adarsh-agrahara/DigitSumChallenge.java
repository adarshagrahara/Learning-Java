public class DigitSumChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 76543;
		
		sumDigits(number);
		
		System.out.println("The sum of the digits of " + number +" is " + sumDigits(number));
		
		

	}
	
	public static int sumDigits(int number) {
		
		if(number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number >0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10;   // same as number = number / 10;
        }

        return sum;
    }
	}



public class A127_EvenDigitSum {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 84;

		System.out.println("the even numbers of " + number + " is equal to " + getEvenDigitSum(number));

	}

	public static int getEvenDigitSum(int number) {

		if(number < 0) {
			return -1;
		}

		int sum = 0;

		// 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
		while (number > 0) {
			// extract the least-significant digit
			int digit = number % 10;

			if (digit % 2 == 0) {

				sum += digit;


			}

			// drop the least-significant digit
			number /= 10;   // same as number = number / 10;
		}

		return sum;
	}
}


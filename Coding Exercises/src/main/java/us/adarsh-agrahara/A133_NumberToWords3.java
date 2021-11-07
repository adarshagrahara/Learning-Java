public class A133_NumberToWords3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		reverse(100);
//		numberToWords(100);
//		System.out.println(getDigitCount(123));

	}

	public static boolean numberToWords(int number) {

		int actualnum = number;

		int positivenum = Math.abs(number);

		number = positivenum;

		int lastDigit = 0;

		int reverse = 0;

		int numberword = 0;

		if(number > 0) {

			while (number > 0) {

				numberword = number % 10;

				number /= 10;

				switch(numberword) {

				case 0:
					System.out.println("ZERO");
					break;

				case 1:
					System.out.println("ONE");
					break;
				case 2:
					System.out.println("TWO");
					break;
				case 3:
					System.out.println("THREE");
					break;
				case 4:
					System.out.println("FOUR");
					break;
				case 5:
					System.out.println("FIVE");
					break;
				case 6:
					System.out.println("SIX");
					break;
				case 7:
					System.out.println("SEVEN");
					break;
				case 8:
					System.out.println("EIGHT");
					break;
				case 9:
					System.out.println("NINE");
					break;
				default:

					System.out.println("OTHER");
					break;

				}




			}



		}





		return false;
	}

	public static int reverse(int reverso) {






		int lastDigit = 0;

		int reverse = 0;

		if(reverso > 0) {

			while (reverso > 0) {

				lastDigit = reverso % 10;

				reverse = reverse * 10;

				reverse += lastDigit;

				reverso = reverso /10;



				

					

				



			}
			
			

			numberToWords(reverse);

			return reverse;



		}






		return -1;
	}
	
//	public static int getDigitCount(int number) {
//		
//		if (number >4 0) {
//		
//		int digits = String. valueOf(number).length();
//		
//		return digits;
//		
//		
//		}
//	
//		
//		return -1;
//	}

}

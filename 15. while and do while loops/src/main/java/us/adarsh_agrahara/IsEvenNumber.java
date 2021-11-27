public class IsEvenNumber {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 21;

		int end = 49;

		System.out.println("The sum of the first 5 even numbers between " + start +" and " + end + " is "+returnEvenNumber(start, end)+ "!");

	}

	public static boolean isEvenNumber(int number) {

		if ((number % 2) == 0) {

			return true;
		}


		return false;
	}

	public static int returnEvenNumber(int start, int end) {

		int count = 0;

		int sum = 0;

		int num = 0;

		while ( start <= end) {

			start ++;



			if(!isEvenNumber(start)) {

				continue;
			}

			num++;
 
			switch(num) {

			case 1:

				System.out.println("The 1st even number is " + start);

				break;


			case 2:

				System.out.println("The 2nd even number is " + start);

				break;


			case 3:

				System.out.println("The 3rd even number is " + start);

				break;

			default:
				System.out.println("The " + num + "th even number is " + start);


			} 



			sum += start;

			count ++;

			if (count == 5) {


				return sum;

			}



		}

		return -1;


	}

}

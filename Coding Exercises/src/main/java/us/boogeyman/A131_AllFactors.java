public class A131_AllFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 32;

		printFactors(number);


	}

	public static void printFactors(int number) {

		if (number > 0) {

			int count  = 1;

			while(count <= number) {
				
				


				if((number % count) == 0) {


					System.out.println(count);

				}



				count++;




			}

		} else {

			System.out.println("Invalid Value");

		}

	}

}

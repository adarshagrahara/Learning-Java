public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;

		while (count != 5) {

			System.out.println("count is " + count);

			count++;


		}
		
		System.out.println("***********************************************************************************");

		int countish = 1;

		int end = 5;

		while(true) {
			

			if(countish > end) {

				System.out.println("uh oh, countish is more than " + end);

				break;

			}

			
			System.out.println("the count is " + countish);

			countish ++;



		}
		
		System.out.println("***********************************************************************************");
		
		int countbish = 1;
		
		do {
			
			System.out.println("the count is " + countbish);
			countbish++;
		
		} while (countbish !=6);
		
		

	}

}

public class A132_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = -1;

		System.out.println(isPerfectNumber(number));


	}

	public static boolean isPerfectNumber(int number) {

		if (number > 0) {

			int count  = 1;
			
			int sum = 0;

			while(count <= number) {




				if((number % count) == 0) {


					
					
					sum += count;
					
					
					
					

				}



				count++;




			}
			
			sum -= number;
			
			if(sum == number) {
				
				return true;
			} else {
				
				return false;
			}

		} 

		return false;

	}

}



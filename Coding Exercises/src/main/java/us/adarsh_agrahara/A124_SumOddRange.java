public class A124_SumOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		isOdd(24);
		System.out.println(sumOdd(1,11));

	}

	public static boolean isOdd(int number) {

		if (number > 0) {

			if (number % 2 == 0){

				return false;

			} else {

				return true;
			}



		}

		return false;

	}

	public static int sumOdd(int start, int end) {

		if( start > 0 && end > 0 && end >= start) {


			int sum = 0;

			for(int i = start; i <= end; i++) {


				int odd = i % 2;

				if (odd != 0) {

					sum += i;


				}
 

			}
			

			
			isOdd(sum);
			
			return sum;
			
			
			
			

		} 

		return -1;

	}

}
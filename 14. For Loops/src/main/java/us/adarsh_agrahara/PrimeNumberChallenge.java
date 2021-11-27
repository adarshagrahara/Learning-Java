public class PrimeNumberChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 5;
		
		boolean tryPrime = isPrime(count);
		
		
		
		for(int i=10; i<50; i++) {
			
			if (tryPrime) {
				
				int increment = count + count;
				
				int increment2 = increment + count;
				
				
			}
			
		}
		

	}

	public static boolean isPrime(int n) {

		if(n==1) {
			return false;
		}

		for(int i = 2; i <= n/2; i++) {

			if(n%i == 0) {

				return false;
			}

		}
		
		return true;

	}

}

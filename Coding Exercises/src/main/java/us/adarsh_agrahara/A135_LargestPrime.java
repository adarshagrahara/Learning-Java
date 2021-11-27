public class A135_LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(getLargestPrime());

	}
	
public static int getLargestPrime(int number) {
	
	int origNum = number;
	
	int number1 = number/2;
	
	if(number < 2) {
		
		return -1;
		
	}
	
	
	for(int i = number1; i <= number; i--) {
		
		
		if(number % i == 0) {
			
			if(i == 1 || i == 0) {
				
				return origNum;
				
			}
			
			return i;
			
		}
		
	}
	
	return -1;
}


}

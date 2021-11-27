public class Sum3and5Challenge {

	public static void main(String[] args) {
		
		
		int count = 0;
		
		int sum = 0;
		
		for(int i = 1; i <= 1000; i ++) {
			
			int iremainder = i % 3;
			
			int iremainder2 = i % 5;
			
			if (iremainder == 0 && iremainder2 ==0) {
				
				sum += i;
				
				count++;
				
				
				
				System.out.println(i + " is divisible by 3 and 5");
				
				
				
				
				
				
				
			}
			
			if (count == 5) {
				
				
				break;
				
			}
			
		}
		
		System.out.println(sum);
		

	}

}

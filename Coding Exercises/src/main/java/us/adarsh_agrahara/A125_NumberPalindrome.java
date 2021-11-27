public class A125_NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int number = -272;
		
		isPalindrome(number);
		
		if (isPalindrome(number)) {
			
			System.out.println("The number " + number + " is a palindrome");
			
		} else {
			
			System.out.println("The number " + number + " is not a palindrome");
			
		}
		
		
		
		
		

	}
	
	public static boolean isPalindrome(int number) {
		 
		int actualnum = number;
		
		int positivenum = Math.abs(number);
		
		number = positivenum;
	
		int lastDigit = 0;
		
		int reverse = 0;
		
		if(number > 0) {
			
			while (number > 0) {
				
			    lastDigit = number % 10;
			    
			    reverse = reverse * 10;
			    
			    reverse += lastDigit;
			    
			    number = number /10;
			   
			    
			    if (positivenum == reverse) {
			    	
			    	return true;
			    	
			    } else {
			    	
			    	continue;
			    }
			    
			    
			    
			}
			
			
			
		}
		
		return false;
	}

}

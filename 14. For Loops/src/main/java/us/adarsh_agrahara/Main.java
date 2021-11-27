public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		for(int i = 2; i  < 9; i++) {
			
			System.out.println(String.format("%.2f",calculateInterest(10000.00, i)));
			
			

			
		}
		System.out.println("*********************************");
		
		for(int i = 8; i >= 2; i--) {
			
			System.out.println(String.format("%.2f",calculateInterest(10000.00, i)));
			
			

			
		}
		
		

	}
	
	public static double calculateInterest(double amount, double interestRate) {
		
		return (amount * (interestRate /100));
	}

}

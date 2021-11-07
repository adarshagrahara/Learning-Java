public class A120_IntEqualityPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printEqual(2,2,2);
		
	}
	
	public static void printEqual(int uno, int dos, int tres) {
		
		if (uno < 0 || dos < 0 || tres < 0) {
			
			System.out.println("Invalid Value");
			
		
			
		} else {
			
			if (uno == dos && uno == tres && dos == tres) {
				
				System.out.println("All numbers are equal");
				
			} else if (uno == dos || uno == tres || dos == tres){
				
				System.out.println("Neither all are equal or different");
				
			} else {
				
				System.out.println("All numbers are different");
				
			}
			
		}
		
		
		
		
	
	}

}

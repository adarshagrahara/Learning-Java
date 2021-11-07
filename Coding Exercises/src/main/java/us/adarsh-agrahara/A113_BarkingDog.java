public class A113_BarkingDog {

	public static void main(String[] args) {
		
		boolean dog = true;
		
		int hourOfDay = 23;
		
		shouldWakeUp(dog, hourOfDay);
		

	}
	
	public static boolean shouldWakeUp(boolean dog, int hourOfDay) {
	
		
		
		if (dog) {
			
			
			if (hourOfDay > -1 && hourOfDay < 8 || hourOfDay < 24 && hourOfDay > 22) {
				
				return true;
			 
				
			}
			
			
			return false;
			
			
		}
		
		if (!dog) {
				
			return false;
		
			
		}
		
		return false;
		
	
	}

}

public class A121_PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isCatPlaying(false, 35));
		
	}
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		
		if (!summer) {
			
			if (temperature > 24 && temperature < 36) {
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		}
		
		if (summer) {
			
			if (temperature > 24 && temperature < 46) {
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		}
		
		return false;
	}

}

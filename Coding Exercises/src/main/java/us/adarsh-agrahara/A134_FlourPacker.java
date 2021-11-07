public class A134_FlourPacker {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bigCount = 1; 
		
		int smallCount = 0;
		
		int goal = 5;

		System.out.println(canPack(bigCount, smallCount, goal));

	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		
		bigCount *= 5;
		
		if(smallCount == 0) {
			
			return false;
			
		}
		
		if(bigCount % smallCount  >= 0) {
			
			return true;
			
			
		}
		
		return false;
		
		
	}

}

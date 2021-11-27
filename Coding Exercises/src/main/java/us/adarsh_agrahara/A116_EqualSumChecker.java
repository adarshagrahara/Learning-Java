public class A116_EqualSumChecker {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int uno = 5;
		int dos = 4;
		int tres = 7;
		
		boolean test = hasEqualSum(uno, dos, tres);
		
		System.out.println(test);


	}
	
	public static boolean hasEqualSum(int uno, int dos, int tres) {
		
		if (uno + dos == tres) {
			
			return true;
			
		}
		
		return false;
		
		
	}

}

public class A115_DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double uno = -3.1756;
		double dos = -3.175;
		
		boolean test = areEqualByThreeDecimalPlaces(uno, dos);
		
		System.out.println(test);


	}
	
	public static boolean areEqualByThreeDecimalPlaces(double uno, double dos) {
		
		int uno1 = (int) (uno * 1000);
		
		int dos1 = (int) (dos * 1000);
		
		if (uno1 == dos1) {
			
			return true;
			
		}
		
		
		return false;
		
		
	}

}

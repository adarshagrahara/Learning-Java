public class A117_TeenNumberChecker {

	public static void main(String[] args) {
		
		int age1 = 12;
		int age2 = 90;
		int age3 = 45;
		int age = 18;
		
		hasTeen(age1, age2, age3);
		isTeen(age);
		
	}

	public static boolean hasTeen (int age1, int age2, int age3) {
		
		if (age1 < 20 && age1 > 12) {
			
			return true;
			
		}
		if (age2 < 20 && age2 > 12) {
			
			return true;
			
		}
		if (age3 < 20 && age3 > 12) {
			
			return true;
			
		}
		
		
		return false;
		
	}
	public static boolean isTeen (int age) {
		
		if (age < 20 && age > 12) {
			
			return true;
			
		}
		return false;
		
	}
	
}

public class zMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intVar = new int[55];
//		int[] intVar = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < intVar.length; i++) {
			intVar[i] = i*10;
		}
		printArray(intVar);
		
//		System.out.println(intVar[5]);
//		System.out.println(intVar[2]);
//		System.out.println(intVar[9]);
		
	}
	
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element "+i+ " Value is " + array[i]);
		}
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number = "1245.34";
		
		System.out.println(number + " is printed out as a string");
		
		double intNumber = Double.parseDouble(number);
		
		System.out.println(intNumber +" is printed out as an int");
	
		
		number += 1;
		
		intNumber += 1;
		
		System.out.println(number + " is printed out as a string");
		
		System.out.println(intNumber +" is printed out as an int");
		
		
	
	}

}

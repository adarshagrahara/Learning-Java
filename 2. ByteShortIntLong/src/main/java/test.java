import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		
		System.out.println("input any number between 2147483647 and -2147483648 and your number will be printed as either a byte, short, or integer.");                   
		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		long myMinlongValueTest = myObj.nextLong();
		
		
		
		
		for (byte i = 1; i < 2; i++) {
		
		
		if (myMinlongValueTest <= 127 && myMinlongValueTest >=-128){
			
		
		byte Total = (byte)(myMinlongValueTest / 1);
		
		System.out.println("the byte value is " + Total);
		
		break;
		
		}
		
		if (myMinlongValueTest <= 32767 && myMinlongValueTest >= -32768){
			
			
			short Total = (short)(myMinlongValueTest / 1);
			
			System.out.println("the short value is " + Total);
			
			break;
			
			}

		if (myMinlongValueTest <= 2147483647 && myMinlongValueTest >= -2147483648){
			
			
			int Total = (int)(myMinlongValueTest / 1);
			
			System.out.println("the int value is " + Total);
			
			break;
			
			}
	
	}
	
	}

	

}


public class Main {

	public static void main(String[] args) {
		int a = 10000;
		
		
		
		
		
		
		int myMinIntValue = Integer.MIN_VALUE;
		
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("my minimum value for int= " + myMinIntValue);
		System.out.println("my maximum value for int= " + myMaxIntValue);
		
		System.out.println("Busted MIN value for int= " + (myMinIntValue - 1));
		System.out.println("Busted MAX value for int= " + (myMaxIntValue + 1));
		
		int maxIntValue = 2147483647;
			
		
		
		
		
		
		
		byte myMinByteValue = Byte.MIN_VALUE;
		
		byte myMaxByteValue = Byte.MAX_VALUE;
		
		System.out.println("my minimum value for byte= " + myMinByteValue);
		System.out.println("my maximum value for byte= " + myMaxByteValue);
		
		byte maxByteValue = 127;
		
		
		
		
		
		
		Short myMinShortValue = Short.MIN_VALUE;
		
		Short myMaxShortValue = Short.MAX_VALUE;
		
		System.out.println("my minimum value for Short= " + myMinShortValue);
		System.out.println("my maximum value for Short= " + myMaxShortValue);
		
		short maxShortValue = 32767;	
		
		
		
		
		
		
		long myLongValue = 100L;
		
		Long myMinLongValue = Long.MIN_VALUE;
		
		Long myMaxLongValue = Long.MAX_VALUE;
		
		System.out.println("my minimum value for Long= " + myMinLongValue);
		System.out.println("my maximum value for Long= " + myMaxLongValue);
		
		Long bigmaxLongValue = 2975L;
		System.out.println(bigmaxLongValue);
		
		
		//------------------------------------------------------------------------------------
		
		int myTotal = (myMinIntValue / 2);
		System.out.println(myTotal);
		//the reason this works is because the (myMinIntValue / 2) is being treated like and an integer and it gets treated like and integer by default
		
		// byte myBtyeTotal = (myMinByteValue / 2);
		//the reason this does not work is because (myMinByteValue / 2); is being treated like a integer although it is a byte. so it cannot convert it to a integer byitself.

		byte myBtyeTotal = (byte)(myMinIntValue / 3);
		
		short myShortTotal = (short)(myMinIntValue / 3);
		
		
		
		

	}
	

}

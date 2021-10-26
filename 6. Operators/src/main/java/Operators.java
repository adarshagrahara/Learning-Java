
public class Operators {

	public static void main(String[] args) {
		
		int result = 1 + 2; // 1 + 2 = 3
		
		System.out.println("1 + 2 = " + result);
		
		int prevResult = result;
		
		System.out.println("prevResult = " + prevResult);
		
		result = result - 1; // 3-1 = 2
		
		System.out.println("3 - 1" + result);
		
		System.out.println("prevResult = " + prevResult);
		// we arent changing prevResult, we are only changing result with prevResult
		
		result = result * 10; //2 * 10 = 20
		
		System.out.println("2 * 10 = " + result);
		
		result = result / 5; //20 / 5 = 4
		
		System.out.println("20 / 5 = " + result);
		
		result = result % 3; //the remainder of 4/3, so it will either be 1 or 0, but because 4/3 doesnt go smoothly, it will end with a remainder of 1
		
		System.out.println("4 % 3 = " + result);
		
		// result = result + 1
		result++;
			
		System.out.println("1 + 1 = " + result);
		
		result--; // 2 - 1 = 1
		
		System.out.println("2 - 1 = " + result );
		
		result += 3; // 1 + 3 = 4 
		
		System.out.println("1 + 3 = "+ result);
		
		result--; // 4 - 1 = 3
		
		System.out.println("4 - 1 = " + result );
		
		// result = result * 10
		
		result *= 10; // 3 * 10 
		
		System.out.println("3 * 10 = "+ result);
		
		//result = result / 3
		
		result /= 3; // 30 / 10 
		
		System.out.println("30 / 10 = "+ result);
		
		//result = result - 2
		
		result -= 2; //10 - 2
		
		System.out.println("10 - 2 = " + result);
		
		boolean isAlien = false;
		
		if (isAlien == false) {
			
			System.out.println("It is not an Alien!");
		    System.out.println("I am very scared right now!");
		}
		
		if (isAlien == true) {
			
			System.out.println("It is an Alien!");
		}
		
		int topscore = 81;
		
		if (topscore < 100) {
			System.out.println("you got the highest score!!!!!!!");
		}
		
		int secTopScore  = 90;
		
		if (topscore > secTopScore && topscore < 100) { //logical and operator, this is when you have to check multiple things before it does the if statement
		
		System.out.println("Greater Than second top score and less than 100");
		
		}
		
		if ((topscore > 90) || (secTopScore <= 90)) {
			
			System.out.println("neither or both of the conitions are true");
			
			
		}
		
		
		
		int newValue = 50;
		
		if (newValue == 50) {
			
			// one = sign is to assign a value to a variable, but if you have 2 =, then it is to compare.
			
			System.out.println("this is an error");
		}
		
		
		boolean isCar = false;
				
		if (isCar) {
			
			System.out.println("This is not supposed to happen");
		}
		
		isCar = true;
		boolean wasCar = isCar ? true : false;
		// this is saying, if the boolean isCar is true, set wasCar to true, if the boolean isCar is false, set wasCar to false.
		
		if (!wasCar) {
			
			System.out.println("wasCar is false");
			
		}
		if (wasCar) {
			
			System.out.println("wasCar is true");
			
		}
		
		
		
		}
	
		
		
			
		
		
				
		
	}



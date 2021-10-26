
public class Main {

	public static void main(String[] args) {


		int test = whateverIwant(true, 80, 5, 100);
		// the values of finalScore will be transferred to test because it is using the values from test

		whateverIwant(true, 100, 2, 12);
		
		whateverIwant(false, 100, 2, 12);
		// nothing will happen if it is false
		
		test = test * 10 -30;
		
		System.out.println(test);
	


	}




	public static int whateverIwant(boolean gameOver, int score, int levelcompleted, int bonus ) {



		if (gameOver)  {
			//if game over is true
			int finalScore = score + (levelcompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was "+ finalScore);
			return finalScore;
			
		} 
			
		
		return -1;
		

	
		
	}


}


public class Main {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 80;
		int levelcompleted = 5;
		int bonus = 100;

// 		if (score < 500 && score > 100) {
//			System.out.println("Your score was less 500 but more than 100");
//		} else if (score  < 100 ){
//			System.out.println("Your score was less 100");
//			//it ignored the first print because the score was 500, and not less than 500, so it defaulted to 500, vecause there was nothing. 
//		} else {
//			System.out.println("Why");
//		}
//
//		System.out.println("Test");

		// this will always be executed because it has nothing to do with the code block!

		
		if (gameOver)  {
			int finalScore = score + (levelcompleted * bonus);
			System.out.println("Your final score was "+ finalScore);
		}
		score = 10000;
		levelcompleted = 8;
		bonus = 200;
		
		if (gameOver)  {
			int finalScore2 = score + (levelcompleted * bonus);
			System.out.println("Your second final score was "+ finalScore2);
		}

	}


}

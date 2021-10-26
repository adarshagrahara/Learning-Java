
public class MethodChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


		int highscoretable = calculateHighscoreposition(1500);

		displayHighscorePosition(highscoretable, "beb");
		
		
		highscoretable = calculateHighscoreposition(900);

		displayHighscorePosition(highscoretable, "cheb");
		
		
		highscoretable = calculateHighscoreposition(400);

		displayHighscorePosition(highscoretable, "sheb");

		
		highscoretable = calculateHighscoreposition(50);

		displayHighscorePosition(highscoretable, "ueb"); // for example it is taking the name "ueb" and putting it as the string "name" to use in that method


	}

	public static void displayHighscorePosition(int highscoretable, String name) {

		System.out.println(name + " managed to get into position " + highscoretable + " on the high score table!");



	}

	public static int calculateHighscoreposition(int playerscore) {


		if (playerscore >= 1000)  {

			return 1;
			// instead of doing int highscore = 1;
			//                  return highscore;
			// you can just do return 1;

		} 
		if (playerscore >= 500)  {
					// there is no need to put an && playerscore < 1000 to check because in the first if statement, it is already checking for that
			return 2; 

		}
		if (playerscore >= 100)  {

			return 3; 

		} else {

			return 4;
		}


	}

}


public class Main {

	public static void main(String[] args) {

		int newScore = calculateScore("Tim", 700);
		
		System.out.println("New Score is " + newScore);

		calculateScore(400);
		
		calculateScore();
		

	}

	public static int calculateScore(String playerName, int score) {

		System.out.println("Player " + playerName + " scored " + score + " points!");

		return score * 100;

	}
	
	public static int calculateScore(int score) {

		System.out.println("Unnamed player scored " + score + " points!");

		return score * 100;

	}
	
	public static int calculateScore() {

		System.out.println("Unnamed player scored nothing!");

		return 0;

	}

}



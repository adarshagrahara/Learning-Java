import java.util.Random;

public class LogicalNotOperator {

	public static void main(String[] args) {



		Random rand = new Random(); //instance of random class
		int upperbound = 100;
		//generate random values from 0-24
		int int_random = rand.nextInt(upperbound);

		System.out.println(int_random);





		int i = 0;

		while (i < 1) {

			i++;

			boolean isHouse = (int_random >= 50) ? true : false;

			if (isHouse) {

				System.out.println("there is a house!");

			}

			if (!isHouse) {

				System.out.println("there is no house!");

			}



		}






	}

}


public class OperatorChallenge {

	public static void main(String[] args) {

		double doublevar = 20.00d;

		double doublevar2 = 80.00d;

		double doublevarTotal = ((doublevar + doublevar2) * 100.00d) % 40.00d;

		boolean remainderval = (doublevarTotal == 0) ? true : false;

		System.out.println("my remainder value = " + remainderval);

		if (!remainderval) {

			System.out.println("Got some remainder");

		}




	}

}

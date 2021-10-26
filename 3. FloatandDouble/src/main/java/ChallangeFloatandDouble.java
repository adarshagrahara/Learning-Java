import java.util.Scanner;
public class ChallangeFloatandDouble {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double GivenNumberinPounds = input.nextDouble();
		// whatever is inputed here will be converted from pounds to kilos 
		
		double kilograms = 	.45359237;
		
		double ResultinKilograms = GivenNumberinPounds * kilograms;
		
		System.out.println(ResultinKilograms);
	}

}

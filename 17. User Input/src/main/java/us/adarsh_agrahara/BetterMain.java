import java.util.Date;
import java.util.Scanner;

public class BetterMain {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int birthYear = 0;

		int year = getYear();



		Scanner scanner = new Scanner(System.in);


		for(int i = 1; i > 0; i++) {

			System.out.println("Enter your year of birth:");

			String yearOfBirth = scanner.nextLine();


			if(yearOfBirth.matches("^[0-9]*$") && yearOfBirth.length() > 0){

				birthYear = Integer.parseInt(yearOfBirth);

				if(year - birthYear <= 100 && year- birthYear >= 1) {
					break;
				}

				int min = year - 100;

				System.err.println("Error, please enter your real birth year ("+min+"-"+(year-1)+")");

				continue;

			} 

			System.err.println("Error, please enter an integer.");
		}

		int age = year - birthYear;

		System.out.println("Enter your name:");

		String name = scanner.nextLine();

		System.out.println("Your name is "+ name +" and you are " + age+ " years old.");


		scanner.close();



	}


	public static int getYear() {

		Date d=new Date();
		int year=d.getYear();

		year += 1900;

		return year;
	}

}

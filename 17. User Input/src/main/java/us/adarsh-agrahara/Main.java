import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int year = getYear();

		
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter your year of birth:");

		int birthYear = scanner.nextInt();
		scanner.nextLine(); // you gotta do this always after you use a scanner for an number data type.
		
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

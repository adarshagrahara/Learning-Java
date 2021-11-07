public class A111_SpeedConverter {

	public static void main(String[] args) {

		double kilometersPerHour = 1.5;

		long kmphValue = toMilesPerHour(kilometersPerHour);

		printConversion(kilometersPerHour);
		
		





	}

	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour >= 0){
			
			

			double kmphTomph = (kilometersPerHour / 1.609);
			
			long kmphValue = (long) Math.round(kmphTomph);
			
			return kmphValue;
			
			
			





		}

		return -1;


	}

	public static void printConversion(double kilometersPerHour) {

		if (kilometersPerHour >= 0) {

			double kmphTomph = (kilometersPerHour / 1.609);
			
			long kmphValue = (long) Math.round(kmphTomph);


			System.out.println(kilometersPerHour + " km/h = " + Math.round(kmphValue) + " mi/h");

			

		}


		if (kilometersPerHour < 0) {

			System.out.println("Invalid Value");

		}






	}

}



public class A123_NumberOfDaysInMOnth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isLeapYear(10);
		System.out.println(getDaysInMonth(2,2020));

	}

	public static boolean isLeapYear(int year) {

		if (year >= 1 && year <= 9999) {

			if (year % 4 != 0) {
				return false;
			} else if (year % 400 == 0) {
				return true;
			} else if (year % 100 == 0) {
				return false;
			} else {
				return true;
			}

		}


		return false;


	}

	public static int getDaysInMonth(int month, int year) {

		if (month > 0 && month < 13 && year > 0 && year < 9999) {

			if (year % 4 != 0) {

				switch (month) {

				case 1:
					return 31;
				case 2:
					return 28;


				case 3:
					return 31;


				case 4:
					return 30;


				case 5:
					return 31;


				case 6:
					return 30;


				case 7:
					return 31;


				case 8:
					return 31;


				case 9:
					return 30;


				case 10:
					return 31;


				case 11:
					return 30;


				case 12:
					return 31;


				default: 
					return 31;


				}

			} else if (year % 400 == 0) {
				switch (month) {

				case 1:
					return 31;


				case 2:
					return 29;


				case 3:
					return 31;


				case 4:
					return 30;


				case 5:
					return 31;


				case 6:
					return 30;


				case 7:
					return 31;


				case 8:
					return 31;


				case 9:
					return 30;


				case 10:
					return 31;


				case 11:
					return 30;


				case 12:
					return 31;


				default: 
					return 31;


				}
			} else if (year % 100 == 0) {
				switch (month) {

				case 1:
					return 31;


				case 2:
					return 28;


				case 3:
					return 31;


				case 4:
					return 30;


				case 5:
					return 31;


				case 6:
					return 30;


				case 7:
					return 31;


				case 8:
					return 31;


				case 9:
					return 30;


				case 10:
					return 31;


				case 11:
					return 30;


				case 12:
					return 31;


				default: 
					return 31;


				}
			} else {

				switch (month) {

				case 1:
					return 31;


				case 2:
					return 29;


				case 3:
					return 31;


				case 4:
					return 30;


				case 5:
					return 31;


				case 6:
					return 30;


				case 7:
					return 31;


				case 8:
					return 31;


				case 9:
					return 30;


				case 10:
					return 31;


				case 11:
					return 30;


				case 12:
					return 31;


				default: 
					return 31;


				}
			}

		}

		return -1;

	}

}

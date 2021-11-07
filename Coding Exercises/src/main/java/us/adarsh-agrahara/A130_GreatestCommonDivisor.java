public class A130_GreatestCommonDivisor {

	public static void main(String[] args) {
		
		System.out.println(getGreatestCommonDivisor(40,50));
		// TODO Auto-generated method stub

	}

	public static int getGreatestCommonDivisor(int first,int second) {

		if(first >= 10 && second >= 10) {

			if (first > second) {

				for(int i = first; i >= 0; i--) {

					if((first % i) == 0 && (second % i) == 0) {

						return i;
					}

				}

			} else if(second > first) {

				for(int i = second; i >= 0; i--) {

					if((first % i) == 0 && (second % i) == 0) {

						return i;
					}

				}

			} else {

				for(int i = first; i >= 0; i--) {

					if((first % i) == 0 && (second % i) == 0) {

						return i;
					}

				}


			}



		}

		return -1;


	}

}

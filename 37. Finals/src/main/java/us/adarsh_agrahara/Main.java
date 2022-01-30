package us.adarsh_agrahara;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeClass one = new SomeClass("one");
		SomeClass two = new SomeClass("two");
		SomeClass three = new SomeClass("three");
		System.out.println(SomeClass.HELO);
//		Math m = new Math();
		Password password = new ExtendedPassword(123);
		password.storePassword();
		password.letMeIn(1);
		password.letMeIn(1223);
		password.letMeIn(152341);
		password.letMeIn(-432543);
		password.letMeIn(0);
		password.letMeIn(123);
		
		
	
	}

}

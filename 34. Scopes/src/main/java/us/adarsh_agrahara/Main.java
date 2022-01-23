package us.adarsh_agrahara;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String privateVar = "This is private Main";
		ScopeCheck scopeInstance = new ScopeCheck();
		System.out.println("Scope instance for private var = "+ scopeInstance.getPrivateVar());
		System.out.println(privateVar);
		scopeInstance.timesTwo();
	
	}

}

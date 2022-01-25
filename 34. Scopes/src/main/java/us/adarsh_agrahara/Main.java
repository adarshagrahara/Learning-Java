package us.adarsh_agrahara;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String varFour = "This is private Main";
		ScopeCheck scopeInstance = new ScopeCheck();
		scopeInstance.useInner();
		
		System.out.println("Scope instance for private varOne = "+ scopeInstance.getPrivateVar());
		System.out.println(varFour);
		scopeInstance.timesTwo();
		System.out.println("***********************");
		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
		innerClass.timesTwo();
	}

}

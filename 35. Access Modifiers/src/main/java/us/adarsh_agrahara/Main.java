package us.adarsh_agrahara;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account("ME");
		myAccount.deposit(1000);
		myAccount.withdraw(500);
		myAccount.withdraw(-200);
		myAccount.deposit(-20);
		myAccount.withdraw(9000);
		myAccount.calculateBalance();
		System.out.println("Balance on my account = "+ myAccount.getBalance());
	
	}

}

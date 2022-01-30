package us.adarsh_agrahara;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTests firstInstance = new StaticTests("First Instance");
		System.out.println(firstInstance.getName()+" is instance number "+ firstInstance.getNumInstances());
		StaticTests secondInstance = new StaticTests("Second Instance");
		System.out.println(secondInstance.getName()+" is instance number "+ secondInstance.getNumInstances());
		StaticTests thirdInstance = new StaticTests("Third Instance");
		System.out.println(thirdInstance.getName()+" is instance number "+ thirdInstance.getNumInstances());
		
	}

}

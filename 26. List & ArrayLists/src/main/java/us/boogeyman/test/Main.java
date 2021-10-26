import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		groceryList.addGroceryItem("Cheese");
		groceryList.addGroceryItem("Milk");
		groceryList.addGroceryItem("Beans");
		groceryList.addGroceryItem("Oatmeal");
		groceryList.addGroceryItem("Bread");
		groceryList.printGroceryList();
		groceryList.modifyGroceryItem(2,"Yogurt");
		groceryList.printGroceryList();
		groceryList.removeGroceryitem(4);
		groceryList.printGroceryList();
		
	
	
	}

}

class GroceryList{
	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryItem(String item){
		groceryList.add(item);
	}
	public void printGroceryList(){
		System.out.println("You have "+groceryList.size()+" items in your grocery list");
		for(int i = 0; i<groceryList.size(); i++){
			System.out.println((i+1) +". " + groceryList.get(i));
		}
		System.out.println("--------------------");
	}
	
	public void modifyGroceryItem(int position, String newItem){
		groceryList.set((position-1), newItem);
		System.out.println("Grocery item #" + (position)+" has been modified");
	}
	
	public void removeGroceryitem(int position){
		String theItem = groceryList.get(position-1);
		System.out.println("Grocery item #" + (position)+" has been removed");
		groceryList.remove(theItem);
	}
	public String findItem(String searchItem){
//		boolean exists = groceryList.contains(searchItem); // how to find if the item is there or not
		int position = groceryList.indexOf(searchItem);
		if(position >= 0){
			return groceryList.get(position);
		}
		return null;
	}
	
}


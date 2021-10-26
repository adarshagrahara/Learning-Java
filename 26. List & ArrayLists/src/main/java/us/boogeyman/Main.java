package us.boogeyman;
import java.util.ArrayList;



class GroceryList {
      //test
      private ArrayList<String> groceryList = new ArrayList<String>();
      
      public void addGroceryItem(String item) {
            groceryList.add(item);
      }
      
      public void printGroceryList() {
            System.out.println("You have " + groceryList.size() + " items in your grocery list");
            for (int i = 0; i < groceryList.size(); i++) {
                  System.out.println((i + 1) + ". " + groceryList.get(i));
            }
            System.out.println("--------------------");
      }
      
      public void modifyGroceryItem(int position, String newItem) {
            groceryList.set((position), newItem);
            System.out.println("Grocery item #" + (position + 1) + " has been modified");
      }
      
      public void removeGroceryItem(int position) {
            String theItem = groceryList.get(position);
            System.out.println("Grocery item #" + (position + 1) + " has been removed");
            groceryList.remove(theItem);
      }
      
      public String findItem(String searchItem) {
//		boolean exists = groceryList.contains(searchItem); // how to find if the item is there or not
            int position = groceryList.indexOf(searchItem);
            if (position >= 0) {
                  return groceryList.get(position);
            }
            return null;
      }
      
}


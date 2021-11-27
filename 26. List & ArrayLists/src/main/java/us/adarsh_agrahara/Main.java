package us.boogeyman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
      private static final Scanner scanner = new Scanner(System.in);
      private static final GroceryList groceryList = new GroceryList();
      
      public static void main(String[] args) {
            boolean quit = false;
            int choice;
            printInstructions();
            while (!quit) {
                  System.out.println("Enter your choice: ");
                  choice = scanner.nextInt();
                  scanner.nextLine();
                  
                  switch (choice) {
                        case 0:
                              printInstructions();
                              break;
                        case 1:
                              groceryList.printGroceryList();
                              break;
                        case 2:
                              addItem();
                              break;
                        case 3:
                              modifyItem();
                              break;
                        case 4:
                              removeItem();
                              break;
                        case 5:
                              searchForItem();
                              break;
                        case 6:
                              quit = true;
                              break;
                        case 7:
                              processArrayList();
                        default:
                        
                  }
            }
      }
      
      public static void processArrayList(){
            ArrayList<String> newArrayList = new ArrayList<String>();
            newArrayList.addAll(groceryList.getTheGroceryList());
            
            ArrayList<String> nextArrayList = new ArrayList<String>(groceryList.getTheGroceryList());
            
            String[] myArray = new String[groceryList.getTheGroceryList().size()];
            myArray = groceryList.getTheGroceryList().toArray(myArray);
            System.out.println(Arrays.toString(myArray));
      
            ArrayList<String> myArrayList = new ArrayList<String>(Arrays.asList(myArray));
      }
      
      public static void printInstructions() {
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To print the list of grocery items.");
            System.out.println("\t 2 - To add an item to the list.");
            System.out.println("\t 3 - To modify an item in the list.");
            System.out.println("\t 4 - To remove an item from the list.");
            System.out.println("\t 5 - To search for an item in the list.");
            System.out.println("\t 6 - To quit the application.");
      }
      
      public static void addItem() {
            groceryList.addGroceryItem();
      }
      
      public static void modifyItem() {
            groceryList.modifyGroceryItem();
            
      }
      
      public static void removeItem() {
            groceryList.removeGroceryItem();
      }
      
      public static void searchForItem() {
            groceryList.findItem();
      }
      
      
      
}

class GroceryList {
      private static final Scanner scanner = new Scanner(System.in);
      //test
      private final ArrayList<String> theGroceryList = new ArrayList<>();
      
      public void addGroceryItem() {
            System.out.print("Please enter the grocery item: ");
            theGroceryList.add(scanner.nextLine());
      }
      
      public ArrayList<String> getTheGroceryList() {
            return theGroceryList;
      }
      
      public void printGroceryList() {
            System.out.println("You have " + theGroceryList.size() + " items in your grocery list");
            for (int i = 0; i < theGroceryList.size(); i++) {
                  System.out.println((i + 1) + ". " + theGroceryList.get(i));
            }
            System.out.println("--------------------");
      }
      
      public void modifyGroceryItem() {
            System.out.print("Enter item name you would like to modify: ");
            String itemName = scanner.nextLine();
            scanner.nextLine();
            int itemNo = itemFinder(itemName);
            if (itemNo >= 0) {
                  System.out.print("Enter replacement item: ");
                  String newItem = scanner.nextLine();
                  theGroceryList.set((itemNo), newItem);
                  System.out.println("Grocery item #" + (itemNo + 1) + " has been modified");
            } else {
                  System.out.println("That item is not on the list");
            }
            
      }
      
      public void removeGroceryItem() {
            System.out.print("Enter item name you would like to remove: ");
            String itemName = scanner.nextLine();
            scanner.nextLine();
            int itemNo = itemFinder(itemName);
            if (itemNo >= 0) {
                  String theItem = theGroceryList.get(itemNo);
                  System.out.println("Grocery item #" + (itemNo + 1) + " has been removed");
                  theGroceryList.remove(theItem);
                  
            } else {
                  System.out.println("That item is not on the list");
            }
            
      }
      
      public void findItem() {
            // how to find if the item is there or not
            System.out.print("Item to search for: ");
            String searchItem = scanner.nextLine();
            boolean exists = theGroceryList.contains(searchItem);
            if (exists) {
                  System.out.println("Found " + searchItem + " in  our grocery list");
            } else {
                  System.out.println(searchItem + " is not in the shopping list");
            }
            
      }
      
      private int itemFinder(String searchItem) {
//		boolean exists = groceryList.contains(searchItem); // how to find if the item is there or not
            return theGroceryList.indexOf(searchItem);
            
      }
      
}


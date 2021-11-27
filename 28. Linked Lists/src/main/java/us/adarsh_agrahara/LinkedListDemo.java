package us.adarsh_agrahara;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
      
      public static void main(String[] args) {
            LinkedList<String> placesToVisit = new LinkedList<String>();
            addInOrder(placesToVisit, "Sydney");
            addInOrder(placesToVisit, "Melbourne");
            addInOrder(placesToVisit, "Brisbane");
            addInOrder(placesToVisit, "Perth");
            addInOrder(placesToVisit, "Canberra");
            addInOrder(placesToVisit, "Adelaide");
            addInOrder(placesToVisit, "Darwin");
            printList(placesToVisit);
            visit(placesToVisit);
      }
      
      private static void printList(LinkedList<String> visit) {
            
            Iterator<String> i = visit.iterator();
            while (i.hasNext()) {
                  String place = i.next();
                  System.out.println(
                              visit.indexOf(place) + " " + visit.get(visit.indexOf(place))
                  );
            }
            System.out.println("------------------------------");
      }
      
      private static boolean addInOrder(LinkedList linkedList, String newCity) {
            ListIterator<String> stringListIterator = linkedList.listIterator();
            
            while (stringListIterator.hasNext()) {
                  int comparison = stringListIterator.next().compareTo(newCity);
                  if (comparison == 0) {
                        System.out.println(newCity + " is already added");
                        return false;
                  } else if (comparison > 0) {
                        
                        stringListIterator.previous();
                        stringListIterator.add(newCity);
                        return true;
                  }
            }
            stringListIterator.add(newCity);
            return true;
      }
      
      
      private static void visit(LinkedList cities) {
            Scanner s = new Scanner(System.in);
            boolean quit = false;
            boolean goingForward = true;
            ListIterator<String> listIterator = cities.listIterator();
            
            if (cities.isEmpty()) {
                  System.out.println("No cities added yet");
                  return;
            } else {
                  System.out.println("Now visiting " + listIterator.next());
                  printMenu();
            }
            
            while (!quit) {
                  int choice = s.nextInt();
                  s.nextLine();
                  switch (choice) {
                        case 0:
                              System.out.println("Holiday over");
                              quit = true;
                              break;
                        case 1:
                              if(!goingForward){
                                    if(listIterator.hasNext()){
                                          listIterator.next();
                                    }
                                    goingForward = true;
                              }
                              if (listIterator.hasNext()) {
                                    System.out.println("Now visiting " + listIterator.next());
                              } else {
                                    System.out.println("Reached the end of the list");
                                    goingForward = false;
                              }
                              
                              break;
                        
                        case 2:
                              if(goingForward){
                                    if(listIterator.hasPrevious()){
                                          listIterator.previous();
                                    }
                                    goingForward = false;
                              }
                              if (listIterator.hasPrevious()) {
                                    System.out.println("Now visiting " + listIterator.previous());
                              } else {
                                    System.out.println("We are at the start of the list");
                                    goingForward = true;
                              }
                              
                              break;
                        
                        case 3:
                              printMenu();
                              break;
                        
                        default:
                              printMenu();
                              break;
                        
                        
                  }
            }
      }
      
      private static void printMenu() {
            System.out.println("Actions\n" +
                        "1: next city\n" +
                        "2: previous city\n" +
                        "3: menu options\n" +
                        "----------------");
      }
}

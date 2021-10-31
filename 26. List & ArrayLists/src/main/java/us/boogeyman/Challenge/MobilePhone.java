package us.boogeyman.Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MobilePhone {
      
      private static final Scanner s = new Scanner(System.in);
      private static final Contacts contacts = new Contacts();
      
      public static void main(String[] args) {
            System.out.println("This application will help you sort our all of your Contacts");
            boolean quit = false;
            int choice;
            printInstructions();
            while (!quit) {
                  System.out.println("Enter your choice: \t");
                  choice = s.nextInt();
                  s.nextLine();
                  
                  switch (choice) {
                        case 0:
                              printInstructions();
                              break;
                        case 1:
                              printContacts();
                              break;
                        case 2:
                              addContact();
                              break;
                        case 3:
                              modifyContact();
                              break;
                        case 4:
                              removeContact();
                              break;
                        case 5:
                              searchForContact();
                              break;
                        case 6:
                              quit = true;
                              break;
                        default:
                        
                  }
            }
            
      }
      
      public static void printInstructions() {
            System.out.println("----------------------------\n" +
                        "0: Prints Instructions\n" +
                        "1: Prints all Contacts\n" +
                        "2: Adds new Contact\n" +
                        "3: Modifies a Contact\n" +
                        "4: Removes a Contact\n" +
                        "5: Search's for Contact\n" +
                        "----------------------------");
            
      }
      
      public static void addContact() {
            contacts.toAddContactInformation();
      }
      
      public static void printContacts() {
            contacts.toPrintContacts();
      }
      
      public static void modifyContact() {
            contacts.toModifyContacts();
      }
      
      public static void removeContact() {
            contacts.toRemoveContacts();
      }
      
      public static void searchForContact() {
            contacts.toSearchForContact();
      }
      
}

class Contacts {
      private static final Scanner s = new Scanner(System.in);
      private final ArrayList<String[]> contact = new ArrayList<>();
      
      public void toSearchForContact() {
            searchForContacts();
      }
      
      private void searchForContacts() {
            System.out.println("Enter the phone number of your contact to see if they are on your list\t");
            if (findContact(s.nextLine()) >= 0) {
                  System.out.println("That contact is on your list");
            } else {
                  System.out.println("That contact is not on your list");
            }
      }
      
      public void toRemoveContacts() {
            removeContacts();
      }
      
      private void removeContacts() {
            System.out.println("Enter the phone number of the contact you would like to remove\t");
            String stringRemoveContact = s.nextLine();
            int intRemoveContact = findContact(stringRemoveContact);
            if (intRemoveContact == -1) {
                  System.out.println("Cannot find contact");
            } else {
                  contact.remove(intRemoveContact);
                  System.out.println("Contact has been removed");
            }
            
      }
      
      public void toModifyContacts() {
            modifyContacts();
      }
      
      private void modifyContacts() {
            String changedName = null;
            String changedNumber = null;
            System.out.println("Enter the phone number or name of the contact you would like to modify\t");
            int elementNo = findContact(s.nextLine());
            if (elementNo == -1) {
                  System.out.println("Contact was not found");
                  return;
            } else {
                  System.out.println("Contact has been found");
                  System.out.println("Would you like to modify the name (y/n)");
                  if (s.nextLine().equalsIgnoreCase("Y")) {
                        System.out.println("What would you like to change the name to?");
                        changedName = s.nextLine();
                  }
                  System.out.println("Would you like to modify the phone number (y/n)");
                  if (s.nextLine().equalsIgnoreCase("Y")) {
                        System.out.println("What would you like to change the phone number to?");
                        changedNumber = s.nextLine();
                  }
            }
            
            
            if (changedNumber != null && changedName != null) {
                  contact.set((elementNo), new String[]{changedNumber, changedName});
            } else if (changedName != null) {
                  String[] i = contact.get(elementNo);
                  i[1] = changedName;
                  contact.set((elementNo), i);
            } else if (changedNumber != null) {
                  String[] i = contact.get(elementNo);
                  i[0] = changedNumber;
                  contact.set((elementNo), i);
            } else {
                  System.out.println("Nothing has been modified");
            }
            
      }
      
      private int findContact(String string) {
            for (String[] array : contact) {// This loop is used to iterate through the arraylist
                  for (String element : array) {//This loop is used to iterate through the array inside the arraylist
                        if (element.equalsIgnoreCase(string)) {
                              
                              return contact.indexOf(array);
                        }
                  }
            }
            return -1;
      }
      
      public void toAddContactInformation() {
            System.out.println("What is the contact's name?");
            String name = s.nextLine();
            System.out.println("What is the contact's phone number?");
            String phoneNumber = s.nextLine();
            if (findContact(name) >= 0 || findContact(phoneNumber) >= 0) {
                  System.out.println("Contact with the same name already exists");
                  
            } else {
                  addContactInformation(new String[]{phoneNumber, name});
            }
            
      }
      
      private void addContactInformation(String[] information) {
            contact.add(information);
      }
      
      public void toPrintContacts() {
            printContacts();
      }
      
      private void printContacts() {
            System.out.println("You have " + contact.size() + " contacts in your Mobile Phone");
            for (int i = 0; i < contact.size(); i++) {
                  System.out.println((i + 1) + ". " + Arrays.toString(contact.get(i)).replace("[", "").replace("]", "").replace(",", ":"));
            }
      }
      
}


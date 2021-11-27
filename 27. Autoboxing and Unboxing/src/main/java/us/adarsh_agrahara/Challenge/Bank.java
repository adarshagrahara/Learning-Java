package us.adarsh_agrahara.Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
      ArrayList<String> listOfBranches = new ArrayList<String>();
      private Branch branch;
      
      public void addBranch(String branch) {
            Branch theBranch = new Branch(new Customer(new Transactions(1)));
            listOfBranches.add(branch);
      }
      
      public ArrayList<String> getListOfBranches() {
            return listOfBranches;
      }
      
      public Branch getBranch() {
            return branch;
      }
}

class Branch {
      private Customer customer;
      
      public void test(){
      
            String[][][][][][][][] a = new String[3][5][7][9][4][243][65][1];
      }
      
      public Branch(Customer customer) {
            this.customer = customer;
      }
      
      public Customer getCustomer() {
            return customer;
      }
}

class Customer {
      private Transactions transactions;
      
      public Customer(Transactions transactions) {
            this.transactions = transactions;
      }
}

class Transactions {
      private double initialTransaction;
      
      public Transactions(double initialTransaction) {
            this.initialTransaction = initialTransaction;
      }
}


class Main {
      private static Scanner s = new Scanner(System.in);
      
      public static void main(String[] args) {
            Bank bank = new Bank();
            for (int i = 1; i > 0; i++) {
                  System.out.println("Have you been to this Bank before? (y/n)");
                  if (s.nextLine().equalsIgnoreCase("y")) {
                        System.out.println("Which Branch are you located at?");
                        bank.addBranch(s.nextLine());
                        bank.getBranch().test();
                        
                  } else if (s.nextLine().equalsIgnoreCase("n")) {
                        s.nextLine();
                        System.out.println("Would you like to create an account? (y/n)");
                        if (s.nextLine().equalsIgnoreCase("y")) {
                              System.out.println("Which Branch are you located at?");
                        } else if (s.nextLine().equalsIgnoreCase("n")) {
                              System.out.println("We will catch you another time");
                              System.exit(0);
                        }
                  }
            }
            
            
      }
      
}



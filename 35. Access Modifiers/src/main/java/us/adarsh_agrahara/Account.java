package us.adarsh_agrahara;

import java.util.ArrayList;

public class Account {
      private String accountName;
      private int balance = 0;
      private ArrayList<Integer> transactions;
      
      public Account(String accountName) {
            this.accountName = accountName;
            this.transactions = new ArrayList<Integer>();
      }
      
      public int getBalance() {
            return balance;
      }
      
      public void deposit(int amount){
            if (amount > 0) {
                  transactions.add(amount);
                  this.balance += amount;
                  System.out.println(amount + " deposited. \n" +
                              "Balance is now "+this.balance);
            } else{
                  System.out.println("Cannot deposit negative sums");
            }
      
      }
      
      public void withdraw(int withdraw){
            if (withdraw <= this.balance) {
                  withdraw = withdraw*-1;
                  if (withdraw < 0) {
                        transactions.add(withdraw);
                        this.balance += withdraw;
                        System.out.println(withdraw + " withdrawn. \n" +
                                    "Balance is now "+this.balance);
                  } else{
                        System.out.println("Cannot withdraw negative sums");
                  }
            } else{
                  System.out.println("You cannot withdraw what you don't have");
            }
            
            
      }
      
      public void calculateBalance(){
            this.balance = 0;
            for(int i: this.transactions){
                  this.balance += i;
                  
            }
            System.out.println("Calculated balance = " + this.balance);
      }
}

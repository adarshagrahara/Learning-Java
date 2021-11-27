package us.adarsh_agrahara;

import java.util.ArrayList;

public class Main {
      
      public static void main(String[] args) {
            // TODO Auto-generated method stub
//            Customer customer = new Customer("Adarsh", 54.96);
//            Customer anotherCustomer;
//            anotherCustomer = customer;
//            anotherCustomer.setBalance(12.18);
//            System.out.println("The balance for " +customer.getName()+ " is " + customer.getBalance());
            
            ArrayList<Integer> intList = new ArrayList<Integer>();
            intList.add(1);
            intList.add(5);
            intList.add(7);
            
            for (int i = 0; i < intList.size(); i++) {
                  System.out.println(i+": "+intList.get(i));
            }
            System.out.println("-----------");
            
            intList.add(1,2);
      
            for (int i = 0; i < intList.size(); i++) {
                  System.out.println(i+": "+intList.get(i));
            }
            System.out.println("-----------");
            
            intList.remove(1);
      
            for (int i = 0; i < intList.size(); i++) {
                  System.out.println(i+": "+intList.get(i));
            }
            System.out.println("-----------");
            
      }
      
}

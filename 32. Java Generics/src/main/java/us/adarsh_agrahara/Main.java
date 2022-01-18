package us.adarsh_agrahara;

import java.util.ArrayList;
import java.util.List;

public class Main {
      
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            ArrayList<Integer> items = new ArrayList();
            items.add(1);
            items.add(2);
            items.add(3);
            items.add(4);
            items.add(5);
            
            printDoubled(items);
            
            
      }
      
      public static void printDoubled(List<Integer> items) {
            for (int item : items) {
                  System.out.println(item * 2);
            }
      }
      
}

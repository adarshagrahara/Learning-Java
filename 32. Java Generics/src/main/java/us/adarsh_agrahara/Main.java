package us.adarsh_agrahara;

import java.util.ArrayList;

public class Main {
      
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            ArrayList items = new ArrayList();
            items.add(1);
            items.add(2);
            items.add(3);
            items.add(4);
            items.add(5);
            
            printDoubled(items);
            
            
      }
      
      public static void printDoubled(ArrayList items){
            for (int i = 0; i < items.size(); i++) {
                  System.out.println((Integer) items.get(i)*2);
            }
      }
      
}

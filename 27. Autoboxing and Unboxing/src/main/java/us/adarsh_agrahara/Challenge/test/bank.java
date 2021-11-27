package us.adarsh_agrahara.Challenge.test;

import java.util.ArrayList;

public class bank {
     ArrayList<branch> a = new ArrayList<branch>();
     
     public void add(branch branch1){
           a.add(branch1);
           System.out.println(a);
     }
     
}

class branch{
      private branch branch1;
      
      public branch(branch branch1) {
            this.branch1 = branch1;
      }
}

class main{
      private static branch braaaa;
      public static void main(String[] args) {
          bank b = new bank();
          b.add(braaaa);
      }
}

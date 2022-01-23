package us.adarsh_agrahara;

public class ScopeCheck {
      public int publicVar = 2;
      private int privateVar = 1;
      
      public ScopeCheck(){
            System.out.println("Scope Check created, public var = " +publicVar+", private var = "+privateVar);
            
      }
      
      public int getPrivateVar() {
            return privateVar;
      }
      
      public void timesTwo(){
            int privateVar = 2;
            for (int i = 0; i < 10; i++) {
                  System.out.println(i+" times 2 = " +i*privateVar);
            }
      }
}

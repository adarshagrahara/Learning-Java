package us.adarsh_agrahara;

public class ScopeCheck {
      public int publicVar = 2;
      private final int varOne = 1;
      
      public ScopeCheck() {
            System.out.println("Scope Check created, public var = " + publicVar + ", private var = " + varOne);
            
      }
      
      public int getVarOne() {
            return varOne;
      }
      
      public int getPrivateVar() {
            return varOne;
      }
      
      public void timesTwo() {
            System.out.println("varOne is still avialiabe"+varOne);
            int varTwo = 2;
            for (int i = 0; i < 10; i++) {
                  System.out.println(i + " times 2 = " + i * varTwo);
            }
      }
      
      public class InnerClass {
            public int varThree = 3;
            
            public InnerClass() {
                  System.out.println("Inner Class created, private varOne = "+varOne+" private varThree = " + varThree);
            }
            
            public void timesTwo() {
                  
                  for (int i = 0; i < 10; i++) {
                        System.out.println(i + " times 2 = " + i * ScopeCheck.this.varOne);
                  }
            }
      }
}

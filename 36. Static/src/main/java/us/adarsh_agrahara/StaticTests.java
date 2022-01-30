package us.adarsh_agrahara;

public class StaticTests {
      private static int numInstances = 0;
      private String name;
      
      public StaticTests(String name) {
            this.name = name;
            numInstances++;
      }
      
      public int getNumInstances() {
            return numInstances;
      }
      
      public String getName() {
            return name;
      }
}

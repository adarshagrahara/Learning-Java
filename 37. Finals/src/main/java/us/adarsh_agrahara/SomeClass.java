package us.adarsh_agrahara;

public class SomeClass {
      public static final int HELO = 1000;
      public final int instanceNum;
      private static int classCounter = 0;
      private final String name;
      
      public SomeClass(String name) {
            this.name = name;
            classCounter++;
            instanceNum = classCounter;
            System.out.println(name+" created, instance is "+ instanceNum);
      }
}

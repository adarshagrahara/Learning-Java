package us.adarsh_agrahara;

public class Penguin extends Bird{
      public Penguin(String name) {
            super(name);
      }
      
      @Override
      public void fly() {
            super.fly();
            System.out.println("I cannot fly :(");
      }
}

package us.adarsh_agrahara;

public class Parrot extends Bird{
      public Parrot(String name) {
            super(name);
      }
      
      @Override
      public void fly() {
            System.out.println("Flying from branch to branch");
      }
}

package us.adarsh_agrahara.Challenge;

public class DogMain {
      public static void main(String[] args) {
            Labrador rover = new Labrador("rover");
            Dog rover2 = new Dog("rover");
      
            System.out.println(rover2.equals(rover));
            System.out.println(rover.equals(rover2));
      }
}

package us.adarsh_agrahara;

public class Main {
      
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            Dog dog = new Dog("Shepherd");
            dog.breathe();
            dog.eat();
            Parrot bird = new Parrot("parrot");
            bird.breathe();
            bird.eat();
            bird.fly();
            Penguin peng = new Penguin("Emperor penguin");
            peng.fly();
            
      }
      
}

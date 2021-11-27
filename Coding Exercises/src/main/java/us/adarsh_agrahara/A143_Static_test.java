public class A143_Static_test {
}

class Dog{
      // if it is static it is shared between instances
      private static String name;
      public Dog(String name) {
            this.name = name;
      }
      
      public void printName(){
            System.out.println("Dog name is "+ name);
      }
}

class Main098787{
      public static void main(String[] args) {
          Dog a = new Dog("A");// creates a new instance
          Dog b = new Dog("B");// another instance, but both are the same because it got update because both share the same variable because it is static
          a.printName();
          b.printName();
          
      }
}

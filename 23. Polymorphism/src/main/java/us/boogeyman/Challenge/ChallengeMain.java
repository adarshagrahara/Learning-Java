import us.boogeyman.*;

import java.util.Random;

public class ChallengeMain {
      public static void main(String[] args) {
      
            for (int i = 1; i < 6; i++) {
                  Car car = randomCar();
                  System.out.println("Car #" + i + " : " + car.name() + "\n" +
                              "Acceleration: " + car.accelerate() + " seconds 0 to 60\n"+
                              "Cylinders: " + car.getCylinders() + "\n"+
                              "Top Speed: " + car.topSpeed() + " mph\n");
            }
      
      
      }
      public static Car randomCar(){
            Random r = new Random();
            int randomNumber = r.nextInt(2);
            System.out.println("random number is " + randomNumber);
            switch (randomNumber) {
                  case 1:
                        return new Bugatti();
                  case 2:
                        return new Ferrari();
                  case default:
                        return new Porche();
            }
           
      }
}


class Car {
      private final boolean engine;
      private final int cylinders;
      private final int wheels;
      
      public Car(int cylinders) {
            this.engine = true;
            this.cylinders = cylinders;
            this.wheels = 4;
      }
      
      public String name() {
            return null;
           
      }
      
      public double accelerate() {
            return 0;
      }
      
      public double topSpeed(){
            return 0d;
      }
      
      public boolean isEngine() {
            return engine;
      }
      
      public int getCylinders() {
            return cylinders;
      }
      
      public int getWheels() {
            return wheels;
      }
}

class Bugatti extends Car {
      
      public Bugatti() {
            super(16);
      }
      
      @Override
      public double accelerate() {
            return 2.3;
      }
      
      @Override
      public String name() {
            return "Bugatti";
      }
      
      @Override
      public double topSpeed(){
            return 304.77;
      }
      
}

class Ferrari extends Car {
      
      public Ferrari() {
            super(12);
      }
      @Override
      public double accelerate() {
            return 2.4;
      }
      
      @Override
      public String name() {
            return "Ferrari";
      }
      
      @Override
      public double topSpeed(){
            return 211;
      }
}

class Porche extends Car {
      public Porche() {
            super(8);
      }
      @Override
      public double accelerate() {
            return 2.2;
      }
      
      @Override
      public String name() {
            return "Porche";
      }
      
      @Override
      public double topSpeed(){
            return 211;
      }
}
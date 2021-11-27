public class A144_Inheritance_Challenge {
}

class Main{

}

class Vehicle{
      private int steering;
      private int changingGears;
      private int speed;
      
      public Vehicle(int steering, int changingGears, int speed) {
            this.steering = steering;
            this.changingGears = changingGears;
            this.speed = speed;
      }
}

class Car extends Vehicle{
      private int seats;
      private int steeringWheel;
      private int MPH;
      
      public Car(int steering, int changingGears, int speed, int seats, int steeringWheel, int MPH) {
            super(steering, changingGears, speed);
            this.seats = seats;
            this.steeringWheel = steeringWheel;
            this.MPH = MPH;
      }
     
}

class Tesla extends Car{
      private int SUV;
      private int tires;
      private int electric;
      private String name;
      private int autoDrive;
      
      public Tesla(int steering, int changingGears, int speed, int seats, int steeringWheel, int MPH, int SUV, int tires, int electric, String name, int autoDrive) {
            super(steering, changingGears, speed, seats, steeringWheel, MPH);
            this.SUV = SUV;
            this.tires = tires;
            this.electric = electric;
            this.name = name;
            this.autoDrive = autoDrive;
      }
}

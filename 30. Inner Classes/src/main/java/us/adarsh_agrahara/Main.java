package us.adarsh_agrahara;

import java.util.Scanner;

public class Main {
      private static Scanner s = new Scanner(System.in);
      private static Button btnPrint = new Button("Print");
      
      public static void main(String[] args) {
            
            class CLickListener implements Button.OnClickListener{
                  
                  public ClickListener(){
                        System.out.println("I've been attached");
                  }
      
                  @Override
                  public void onClick(String title) {
                        System.out.println(title+" was clicked");
            
                  }
                  btnPrint.setOnClickListener(new ClickListener());
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            // TODO Auto-generated method stub
//            Gearbox car = new Gearbox(6);
////                      Gearbox.Gear first = car.new Gear(1,12.3);
////                      System.out.println(first.driveSpeed(1000));
//            car.operateClutch(true);
//            car.changGear(1);
//            car.operateClutch(false);
//            System.out.println(car.wheelSpeed(1000));
//            car.changGear(2);
//            System.out.println(car.wheelSpeed(3000));
//            car.operateClutch(true);
//            car.changGear(3);
//            car.operateClutch(false);
//            System.out.println(car.wheelSpeed(6000));
      }
      
}

package us.adarsh_agrahara.Challenge.Working;

import jdk.incubator.vector.VectorOperators;

import java.util.ArrayList;

public class Main {
      private static Player e = new Player("hi",2,3);
      
      public static void main(String[] args) {
            test a = new test("hi",2,3);
            
            saveObject(a);
      }
      
      public static void saveObject(ISaveable objectToSave) {
            for(int i = 0; i < objectToSave.write().size(); i++){
                  System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
            }
      }
      
      
}

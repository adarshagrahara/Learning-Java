package us.adarsh_agrahara;

import java.util.ArrayList;

class IntClass {
      private int value;
      
      public IntClass(int value) {
            this.value = value;
      }
      
      public int getValue() {
            return value;
      }
}

public class Main {
      
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            String[] stringArray = new String[10];
            int[] intArray = new int[10];
            ArrayList<String> stringArrayList = new ArrayList<String>();
            stringArrayList.add("poop");
            
            ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
            intClassArrayList.add(new IntClass(54));
            
            Integer integer = new Integer(54);
            Double doubleValue = new Double(54.125);
            
            ArrayList<Integer> IntegerArrayList = new ArrayList<Integer>();
//            for(int i = 0; i <=10; i++){
//                  IntegerArrayList.add(Integer.valueOf(i));
//            }
//            for(int i = 0; i <=10; i++){
//                  System.out.println(i+" ---> "+ IntegerArrayList.get(i).intValue());
//            }
            
//                 Integer myIntValue = 56;
//            int myInt = myIntValue;
            
            ArrayList<Double> doubleArrList = new ArrayList<Double>();
            for(double dbl = 0.0; dbl<= 10.0;dbl+= .5){
                  doubleArrList.add(dbl);
            }
            for(int i = 0; i <= doubleArrList.size()-1;i++){
                  double value = doubleArrList.get(i);
                  System.out.println(i+" ---> "+value);
            
            }
      }
      
}

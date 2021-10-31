package us.boogeyman.test;




import java.util.ArrayList;
import java.util.Scanner;


public class test{
      private static ArrayList<String> hello = new ArrayList<String>();
      
      public void addString(String string){
            hello.add(string);
      }
      
      public void findItem(String string){
            System.out.println(hello.indexOf(string));
      }
}

class main{
      public static void main(String[] args){
            test tes = new test();
            tes.addString("hello");
            tes.addString("hello");
            tes.addString("hello");
            tes.findItem("hello");
            
      }
      
}

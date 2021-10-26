import java.util.Scanner;

public class Main2 {
      
      private static Scanner scanner = new Scanner(System.in);
      public static void main(String[] args) {
            int[] myInt = getInteger(5);
            for (int i = 0; i < myInt.length; i++) {
                  System.out.println("Element "+ i+ " typed value was "+myInt[i]);
            }
            System.out.println("The average is "+getAverage(myInt));
      
            
      }
      
      public static int[] getInteger(int i) {
            System.out.println("Enter "+ i+ " integer values\r");
            int[] values = new int[i];
            for (int j = 0; j < values.length; j++) {
                values[j] = scanner.nextInt();
            }
            return values;
      }
      
      public static double getAverage(int[] array){
            int sum = 0;
            for (int i = 0; i < array.length; i++){
                  sum += array[i];
            }
            return (double) sum / (double) array.length;
      }
}

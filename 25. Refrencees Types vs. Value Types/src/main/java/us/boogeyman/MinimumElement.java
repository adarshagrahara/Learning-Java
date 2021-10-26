import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
//      public static void main(String[] args) {
//
//            System.out.println(findMin(readElements(readInteger())));
//
//      }
      
      private static int readInteger() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the amount of elements you would like to enter\r");
            return input.nextInt();
            
      }
      
      private static int[] readElements(int elementNumber) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter " + elementNumber + " integer values\r");
            int[] values = new int[elementNumber];
            for (int j = 0; j < values.length; j++) {
                  values[j] = input.nextInt();
            }
            System.out.println(Arrays.toString(values));
            return values;
      }
      
      private static int findMin(int[] array) {
            int temp;
            for (int i = 0; i < array.length; i++) {
                  for (int j = i + 1; j < array.length; j++) {
                        if (array[i] > array[j]) {
                              temp = array[i];
                              array[i] = array[j];
                              array[j] = temp;
                        }
                  }
            }
            return array[0];
      }
}




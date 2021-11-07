import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChallengeMain {
      
      private static final Scanner scanner = new Scanner(System.in);
      
      
      public static void main(String[] args) {
            printArray(sortIntegers(getIntegers(5)));
      }
      
      public static int[] getIntegers(int arrays) {
            System.out.println("Enter " + arrays + " integer values\r");
            int[] values = new int[arrays];
            for (int j = 0; j < values.length; j++) {
                  values[j] = scanner.nextInt();
            }
            return values;
      }
      
      public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                  System.out.println("Element " + i + " contents " + array[i]);
            }
      }
      
      public static int[] sortIntegers(int[] input) {
            int[] sortedArray = Arrays.copyOf(input, input.length);
            sortedArray = Arrays.stream(sortedArray)
                        .boxed()
                        .sorted(Collections.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();
            
            return sortedArray;
      }
}

import java.util.Arrays;
import java.util.Comparator;

public class Main {
      
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            int myIntValue = 10;
            int anotherIntValue = myIntValue;
            System.out.println(myIntValue + " equals myIntValue");
            System.out.println(anotherIntValue + " equals anotherIntValue");
            anotherIntValue++;
            System.out.println(myIntValue + " equals myIntValue");
            System.out.println(anotherIntValue + " equals anotherIntValue");
            
            int[] myIntArray = new int[5];
            int[] anotherArray = myIntArray;
            System.out.println("myIntArray " + Arrays.toString(myIntArray));
            System.out.println("anotherArray " + Arrays.toString(anotherArray));
            anotherArray[0] = 1;
            System.out.println("after change myIntArray " + Arrays.toString(myIntArray));
            System.out.println("after change anotherArray " + Arrays.toString(anotherArray));
            anotherArray = new int[]{4, 5, 6, 7, 8};
            modifyArray(myIntArray);
            System.out.println("after modifier myIntArray " + Arrays.toString(myIntArray));
            System.out.println("after modifier anotherArray " + Arrays.toString(anotherArray));
            
      }
      
      private static void modifyArray(int[] array) {
            array[0] = 2;
            array = new int[]{1, 2, 3, 4, 5};
            System.out.println("ModifyArray = " + Arrays.toString(array));
      }
      
      
}

class test {
      public static void main(String[] args) {
            long[] array = {1, 2, 22356, 5234, 52, 3, 4, 6, 5, 42, 24564, 23, 2435, 23, 5423};
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            array = Arrays.stream(array)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .mapToLong(Long::longValue)
                        .toArray();
            
            System.out.println(Arrays.toString(array));
            
            
      }
}

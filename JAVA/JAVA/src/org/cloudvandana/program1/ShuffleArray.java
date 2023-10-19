package org.cloudvandana.program1;
// LOGIC-1
import java.util.Arrays;
import java.util.Random;
public class ShuffleArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(originalArray);
        System.out.println("Shuffled Array: " + Arrays.toString(originalArray));
    }
    public static void shuffleArray(int[] array) {
    	//shuffle array using random class
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            // Swap elements at i and index
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
/*  
  shuffle array elements using collections class
  LOGIC-2
  PROGRAM=>
       import java.util.Arrays;
       import java.util.Collections;
       import java.util.List;
       public class ShuffleArray{
           public static void main(String[] args){
             Integer[] intArray={1,2,3,4,5,6,7};
             List<Integer> inList=Arrays.asList(intArray);
             Collections.shuffle(intList);
             intList.toArray(intArray);
             System.out.println(Arrays.toString(intArray));
           }
       }
*/

/* Algorithm for shuffling an array:
1.Start with an array of elements to be shuffled.
2.Iterate through the array from the last element (index n-1) to the first element (index 0).
3.In each iteration, generate a random index j between 0 and the current index i (inclusive).
4.Swap the elements at indices i and j.
5.Continue this process for all elements in the array, effectively shuffling the array randomly. 
LOGIC-3
import java.util.Random;
public class ShuffleArray{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        // Print the shuffled array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static void shuffleArray(int[] arr) {
        int n = arr.length;
        Random rand = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Swap elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
  */

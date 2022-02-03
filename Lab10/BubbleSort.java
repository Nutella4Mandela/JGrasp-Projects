// BubbleSort.java
// Nelson Villegas
// 3/29/21
import java.util.*;
public class BubbleSort {
   public static long[] sort(int[] nums) {
      long[] counts = {0,0} ;   // [stepCount, swapCount] initially both 
      for (int i = 0; i < nums.length; i++) {
      int smallest = 0;
      for (int j = 1; j < nums.length-i; j++) {
      if (nums[j-1] > nums[j]) {
      smallest = nums[j-1];
      nums[j-1] = nums[j];
      nums[j] = smallest;  
        counts[1]++;
                   
        }
        counts[0]++;               // Each comparison is counted as a "step"
      }
      }
    return counts;                 // return results [stepCount, swapCount]
  }
  // swap two elements of an array
  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}

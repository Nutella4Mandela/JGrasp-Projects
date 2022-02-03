/****************************************************************************
* SelectionSort.java -  An implementation of selection sort for CSI 111
*
* Name: Nelson Villegas
* Date: 3/29/21
*
* The SelectionSort.sort() method takes an array of integers as its input
*    argument and uses the iterative selection sort algorithm to sort the
*    array.  The array is sorted in place, meaning the results are in
*    the same array after the sort is complete.
*
*    The method returns a long[] array of two longs:
*         counts[0] is the number of comparisons (stepCount)
*         counts[1] is the number of swaps performed (swapCount)
****************************************************************************/

public class SelectionSort {

  // the sort() method sorts the entire array in place
  public static long[] sort(int[] nums) {
    long[] counts = {0,0} ;   // [stepCount, swapCount] initially both 0

    for (int i = 0; i < nums.length; i++) {   // Cycle through the array
      // Find the smallest element in the remainder of the array
      int smallest = i;
      for (int j = i + 1; j < nums.length; j++) {

        if (nums[j] < nums[smallest]) {
          smallest = j;            // Found a new 'smallest' element
        }
        counts[0]++;               // Each comparison is counted as a "step"
      }
      if (smallest != i) {
        swap(nums, i, smallest);   // Move the smallest element to position i
        counts[1]++;               // Each swap is counted
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

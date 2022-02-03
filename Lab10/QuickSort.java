/****************************************************************************
* QuickSort.java -  An implementation of quicksort for CSI 111
*
* Name: Nelson VIllegas
* Date: 3/29/21
*
* The QuickSort.sort() method takes an array of integers as its input
*    argument and uses the recursive quicksort algorithm to sort the
*    array.  The array is sorted in place, meaning the results are in
*    the same array after the sort is complete.
*
*    The method returns a long[] array of two longs:
*         counts[0] is the number of times the list is partitioned (stepCount)
*         counts[1] is the number of swaps performed (swapCount)
****************************************************************************/

public class QuickSort {

  // the sort() method starts the algorithm by calling doQuickSort() on
  //    the entire array
  public static long[] sort(int[] nums) {
    long[] counts = {0,0} ;  // [stepCount, swapCount] initially both 0
    doQuickSort(counts, nums, 0, nums.length-1);  // sort the entire array
    return counts;
  }

  // doQuickSort() performs the main steps of the quicksort algorithm by partitioning
  //    the array and then recursively calling itself on each portion
  private static void doQuickSort(long[] counts, int[] nums, int start, int end) {
    if (start < end ) {    // Base case is when the current partition is zero items
      int pivotPoint = partition(counts, nums, start, end) ;
      doQuickSort(counts, nums, start, pivotPoint-1);    // Recurse (lower portion)
      doQuickSort(counts, nums, pivotPoint+1, end);      // Recurse (upper portion)
    }
  }

  // parition() will choose a pivot value (split value) and then partition the array
  //    by moving elements to either the lower portion (if the element is < pivotValue)
  //    or the upper portion (if the element is > pivotValue)
  private static int partition(long[] counts, int[] nums, int start, int end) {
    counts[0]++;                        // Each call to partition is counted as a "step"
    int pivotValue = nums[end];         // Arbitrarily choose the last element as pivotValue
    int pivotPoint = start;             // Index of smaller element

    for (int i = start; i < end; i++) {
      if (nums[i] < pivotValue) {       // If current element is smaller than the pivotValue
        swap(nums, pivotPoint, i);      // move current element into the lower portion
        pivotPoint++;                   // Make the lower portion one element larger
        counts[1]++;                    // Each internal swap is counted
      }
    }
    swap(nums, pivotPoint, end);        // The last value was arbitrarily chosen to be the
                                        //    pivotValue, so now move it to the pivotPoint
    return pivotPoint;
  }

  // swap two elements of an array
  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}

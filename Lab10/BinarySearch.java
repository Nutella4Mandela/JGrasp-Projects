/****************************************************************************
* BinarySearch.java -  A recursive implementation of binary search for CSI 111
*
* Name: Nelson Villegas
* Date: 3/29/21
*
* The BinarySearch.search() method takes an array of integers and a search
*    value as its two arguments and uses the recursive binary search
*    algorithm to find the search value in the array.
*
*    The method returns a long[] array of two longs:
*         answer[0] is the index position of the searched value (-1 if not found)
*         answer[1] is number of comparisons performed (count)
****************************************************************************/

public class BinarySearch {

  // The search() method starts the algorithm by calling binarySearch() on
  //    the entire array
  public static long[] search(int[] nums, int value) {
    // The default result is -1, in case the search value is never found.
    long[] answer = {-1, 0};            // [result, count]
    binarySearch(answer, nums, 0, nums.length-1, value);
    return answer;
  }

  // binarySearch() performs the main steps of the binary search algorithm by
  //    splitting the array around some arbitrary mid point and then recursively
  //    calling itself on either the larger portion or the smaller portion
  private static void binarySearch(long[] answer, int[] nums,
                                  int first, int last, int value) {
    answer[1]++;                       // Each recursive call is counted as a "step"
    if (first <= last) {               // Base case #1: the current portion is zero items
      int mid = (first+last)/2;        // All are integers so this is integer division
      if (nums[mid] == value) {
        answer[0] = mid;               // Base case #2: value is found!
      }
      else if (nums[mid] >= value) {   // Recurse (lower portion)
        binarySearch(answer, nums, first, mid-1, value);
      }
      else {                           // Recurse (upper portion)
        binarySearch(answer, nums, mid+1, last, value);
      }
    }
  }
}

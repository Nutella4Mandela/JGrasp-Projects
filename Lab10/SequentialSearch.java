/****************************************************************************
* SequentialSearch.java -  An implementation of sequential search for CSI 111
*
* Name: Nelson Villegas
* Date: 3/29/21
*
* The SequentialSearch.search() method takes an array of integers and a search
*    value as its two arguments and uses the iterative sequential search
*    algorithm to find the search value in the array.
*
*    The method returns a long[] array of two longs:
*         answer[0] is the index position of the searched value (-1 if not found)
*         answer[1] is number of comparisons performed (count)
****************************************************************************/

public class SequentialSearch {

  // The search() method looks through the array for the searh value
  public static long[] search(int[] nums, int value) {
    // The default result is -1, in case the search value is never found.
    long[] answer = {-1,0};   // [result, count]

    for (int i = 0; i < nums.length; i++) {   // Cycle through the array
      answer[1]++;                      // Each comparison is counted as a "step"
      if (nums[i] == value) {
        answer[0] = i;
        break;         // If value is found, stop looking (terminate the for loop)
      }
    }
    return answer;
  }
}

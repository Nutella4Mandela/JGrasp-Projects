/****************************************************************************
* LinkedListSelectionSort.java
* An implementation of selection sort for linked lists
*
* Name:
* Date:
*
* The LinkedListSelectionSort.sort() method takes a linked list of integers as
*    its input argument and uses the iterative selection sort algorithm to sort
*    the linked list in place by swapping node data values.  No links are changed.
*
*    The method returns a long[] array of two longs:
*         counts[0] is the number of comparisons (stepCount)
*         counts[1] is the number of swaps performed (swapCount)
****************************************************************************/

public class LinkedListSelectionSort {

  // the sort() method sorts the entire array in place
  public static long[] sort(LinkedList theList) {
    long[] counts = {0,0} ;            // [stepCount, swapCount] initially both 0

    Node leftNode = theList.head;      // start at the beginning of the linked list

    // Cycle through the linked list (the tail points to null)
    while (leftNode != null) {

      // Find the smallest node in the remainder of the linked list
      Node smallest = leftNode;
      Node rightNode = leftNode.next;

      while (rightNode != null) {
        counts[0]++;                   // Each comparison is counted as a "step"
        if (rightNode.data < smallest.data) {
          smallest = rightNode;        // Found a new 'smallest' node
        }
        rightNode = rightNode.next;    // Advance to next node
      }

      // Move smallest node to the front by swapping node data
      if (smallest != leftNode) {
        theList.swapData(smallest, leftNode);
        counts[1]++;                   // Each swap is counted
      }
      leftNode = leftNode.next;        // Advance to next node
    }

    return counts;                     // return results [stepCount, swapCount]
  }
}

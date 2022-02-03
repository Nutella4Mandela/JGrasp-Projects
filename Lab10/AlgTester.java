/****************************************************************************
* AlgTester.java -  A driver program to test some algorithms for CSI 111
*
* Name: Nelson Villegas
* Date: 3/29/21
*
* This program is designed to evaluate the performance of various sorting
*   and searching algorithms.  Performance is estimated by using elapsed
*   closk time (by calling the System.nanoTime() method).
*
* An array for sorting and searching is generated from random non-negative
*   integers in a range based on the requested array size.  The value for
*   searching is taken randomly from the array, thus guaranteeing that the
*   value will be found.
****************************************************************************/

import java.util.*;
public class AlgTester {
  public static void main(String[] args) {
    int size = 0;
    int result, searchValue;
    boolean verbose, done;
    String inStr;
    Scanner kbd = new Scanner(System.in);
    Random rand = new Random();
    long startTime = System.nanoTime();
    double elapsedTime;

    while (true) {
      done = false;
      while (! done) {
        System.out.print("\nHow many items in the list (0 to quit)? ");
        inStr = kbd.nextLine();
        try {
          size = Integer.parseInt(inStr);
          done = true;
        }
        catch (Exception e) {  // If user types something other than an integer, try again
          System.out.print("\nPlease enter an integer. ");
        }
      }
      if (size == 0) break; // If user types a 0, terminate

      // Printing a small array is useful for debugging, but it's not good for large arrays.
      if (size > 100) {
         verbose = false;
      } else {
         System.out.print("\nDo you want to print the arrays? ");
         inStr = kbd.nextLine();
         verbose = (inStr.charAt(0) == 'y' || inStr.charAt(0) == 'Y');
      }

      // Create some empty arrays
      int[] randNums = new int[size];  // Stores the original random array
      int[] sortNums = new int[size];  // A sorted array for use with BinarySearch
      int[] nums = new int[size];      // A non-sorted array for use with SequentialSearch
      long[] answer;                   // Each algorithm returns a pair of longs

      // Create an array filled with random, nonnegative integers
      for (int i=0; i<size; i++) {
        randNums[i] = rand.nextInt(size);
      }
      if (verbose) printArray(randNums);

      // PRINT HEADERS
      System.out.println(String.format("\nArray size (n) = %,d:", size));
      System.out.println("-------------------------------------------------------------------------------------");
      System.out.println("Sort Algorithm             Step count            Swap count        Elapsed time (sec)");
      System.out.println("-------------------------------------------------------------------------------------");

      //////////// SORTING ALGORITHMS FIRST

      // SELECTION SORT
      for (int i=0; i<size; i++) {   // make a copy to work with
        sortNums[i] = randNums[i];
      }
      System.out.print("Selection Sort ");
      startTime = System.nanoTime();
      answer = SelectionSort.sort(sortNums);
      elapsedTime = (double)(System.nanoTime() - startTime)/1000000000;
      System.out.println(String.format("%,22d %,21d %,25.4f", answer[0], answer[1], elapsedTime));
      if (verbose) printArray(sortNums);

      // QUICKSORT
      for (int i=0; i<size; i++) {   // make a copy to work with
        nums[i] = randNums[i];
      }
      System.out.print("Quicksort      ");
      startTime = System.nanoTime();
      answer = QuickSort.sort(nums);
      elapsedTime = (double)(System.nanoTime() - startTime)/1000000000;
      System.out.println(String.format("%,22d %,21d %,25.4f", answer[0], answer[1], elapsedTime));
      if (verbose) printArray(nums);

      // BUBBLE SORT
      for (int i=0; i<size; i++) {   // make a copy to work with
        nums[i] = randNums[i];
      }
      System.out.print("Bubblesort   ");
      startTime = System.nanoTime();
      answer = BubbleSort.sort(nums);
      elapsedTime = (double)(System.nanoTime() - startTime)/1000000000;
      System.out.println(String.format("%,22d %,21d %,25.4f", answer[0], answer[1], elapsedTime));
      if (verbose) printArray(nums);


      System.out.println("-------------------------------------------------------------------------------------");


      //////////// SEARCHING ALGORITHMS NEXT
      searchValue = randNums[rand.nextInt(size)];    // Pick a random number to search for (guaranteed to be in list)

      // PRINT HEADERS
      System.out.println(String.format("\nSearching for %,d:", searchValue));
      System.out.println("-------------------------------------------------------------------------------------");
      System.out.println("Search Algorithm           Step count              Found at        Elapsed time (sec)");
      System.out.println("-------------------------------------------------------------------------------------");

      // BINARY SEARCH
      System.out.print("Binary Search    ");
      startTime = System.nanoTime();
      answer = BinarySearch.search(sortNums, searchValue);
      elapsedTime = (double)(System.nanoTime() - startTime)/1000000000;
      System.out.println(String.format("%,20d %,21d %,25.6f", answer[1], answer[0], elapsedTime));

      // SEQUENTIAL SEARCH
      System.out.print("Sequential Search");
      startTime = System.nanoTime();
      answer = SequentialSearch.search(sortNums, searchValue);
      elapsedTime = (double)(System.nanoTime() - startTime)/1000000000;
      System.out.println(String.format("%,20d %,21d %,25.6f", answer[1], answer[0], elapsedTime));

      System.out.println("-------------------------------------------------------------------------------------");

    } // End of while loop

    System.out.println("\nThanks for playing.\nGoodbye!\n");
  }

  private static void printArray(int[] array) {
    System.out.println("The resulting list is:");
    for (int i=0; i<array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}

/****************************************************************************
* LinkedListTester.java -  A driver program to test sorting on a linked list
*
* For CSC 142
* Nelson Villegas
* 4/2/2021
*
* This program is designed to evaluate the performance of selection sort
*   on a linked list by using elapsed clock time (by calling the
*   System.nanoTime() method).
*
* A linked list for searching is generated from random non-negative integers
*   in a range based on the requested linked list size.
*
****************************************************************************/

import java.util.*;
public class LinkedListTester {
  public static void main(String[] args) {
    int size = 0;
    int num;
    boolean verbose = false;
    boolean done = false;
    String inStr;
    Scanner kbd = new Scanner(System.in);
    Random rand = new Random();
    long startTime, endTime;
    long[] answer;                   // Each algorithm returns a pair of longs
    double elapsedTime;
    final double NANO = 1e9;         // to convert nanoseconds to seconds

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
          System.out.print("Please enter an integer. ");
        }
      }
      if (size == 0) break; // If user types a 0, terminate (break out of the outer while loop)

      // Printing a small array is useful for debugging, but it's not good for large arrays.
      if (size <= 100) {
         System.out.print("\nDo you want to print the arrays? ");
         inStr = kbd.nextLine();
         verbose = (inStr.charAt(0) == 'y' || inStr.charAt(0) == 'Y');
      }
      
      // Create an empty linked list
      LinkedList theList = new LinkedList();

      // Create a linked list by pushing random, nonnegative integers on the front of the list
      for (int i=0; i<size; i++) {
		    num = rand.nextInt(size);
         theList.push(num);
      }

      if (verbose) {
        theList.printList();
        System.out.println();
      }

      // PRINT HEADERS
      System.out.println(String.format("\nArray size (n) = %,d:", size));
      System.out.println("-------------------------------------------------------------------------------------");
      System.out.println("Sort Algorithm             Step count            Swap count        Elapsed time (sec)");
      System.out.println("-------------------------------------------------------------------------------------");

      // SELECTION SORT
      System.out.print("Selection Sort ");
      startTime = System.nanoTime();
      answer = LinkedListSelectionSort.sort(theList);
      endTime = System.nanoTime();
      elapsedTime = (double)(endTime - startTime)/NANO;
      System.out.println(String.format("%,22d %,21d %,25.6f", answer[0], answer[1], elapsedTime));
      if (verbose) {
        theList.printList();
        System.out.println();
      }
      
      System.out.println("-------------------------------------------------------------------------------------");
    } // End of while loop

    System.out.println("\nThanks for playing.\nGoodbye!\n");
  }
}

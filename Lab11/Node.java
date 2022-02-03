/**********************************************************************
* Node.Java
* A Java implementation of the nodes needed for the LinkedList class.
*
* B. Kell 11/2019
*
* Adapted from https://www.geeksforgeeks.org/ contributor Rajat Mishra.
***********************************************************************/

public class Node 	{

  // A node has two fields: its data, and a pointer (link) to the next node
  public int data;
  public Node next;

  // Constructor
  // Makes a new free-standing node that can be added to a linked list
  public Node(int d) {
    data = d;
    next = null; // Initially no successor
  }

  // For printing the linked list
  public String toString() {
    return (Integer.toString(this.data));
  }
}

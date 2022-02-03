// isEven.java - Tells whether the user input is even or odd
// Nelson Villegas
// 2/22/21

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
public class isEven {
   public static void main(String args[]) 
   {
      // Prompts for user input
      System.out.print("Please enter an integer: ");
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      
      // This will declare what is even and what is odd
      if (isEven(num)) {
         System.out.println("The number is even"); 
        }
      else {
         System.out.println("The number is odd");
        }
   }
   // I make a new method
   public static boolean isEven(int i){
      // If input is negative, it terminates the program
      if (i < 0) {
      System.exit(1);
      }
      // This code tells whether it is even or odd
      
      // If it is true, then it is even
      if ((i % 2) == 0) {
         return true;
      }
      // If it is false, then it is odd
      if ((i % 2) != 0) {
         return false;
      }
       return false;

    }  
   }
      
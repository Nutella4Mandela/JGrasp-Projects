// PrimeFactorial.java - Randomizes a number and then tells whether it is a prime or not
// If it is a prime, it makes a factorial calculation.
// This is the 3rd time I resubmitted since I realized some of the mistakes that I'm doing
// Nelson Villegas
// 2/23/21

import java.util.Scanner;
import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;
public class PrimeFactorial {
   public static void main(String[] args) 
   {
   // n is the number, answer is the factorial, and result is the message choice
   int n;
   double answer;
   int result;
      
   // If number is prime, then it calculates the factorial
   // If the number is not prime, it does not calculate the factorial
   // In a special case, 1 and 0 are not primes
   do {
   // It randomizes the number from 0 to 50
   Random rand = new Random();
   
   // This makes the variable
   n = rand.nextInt(50);
   answer = factorial(n);

   if (n == 0 || n == 1) {
      System.out.println("The number "+n+" is not a prime\n");
   }
   else if (isPrime(n)) {
         System.out.println("The number "+n+" is not a prime\n");            
        }
   else {
         System.out.println("The number "+n+" is prime\n"); 
         System.out.printf("The factorial(%d) is %,.0f. \n", n, answer);
        }
      // It will ask the user if they want to continue
      // If so, the program will try again
      // If not, then another message will pop up and will terminate the program
      result = JOptionPane.showConfirmDialog(null, "Do you wish to continue?", "A Question:", JOptionPane.YES_NO_OPTION);
 } while(result == 0);
      JOptionPane.showMessageDialog(null, "Goodbye!");
      }
   
     
     // This method calculates whether it is prime or not 
     public static boolean isPrime(int a){
     boolean prime = false;
     for (int b = 2; b <= a / 2; ++b)
     {
      if ((a % b) == 0) {
         prime = true;
       }
     }
   return prime;
   } 
    // This method calculates the factorial if it is a prime
    public static double factorial(int fred) {
    double fact = 1;
    for (int a = 1; a <= fred; a++) {
      fact = fact * a;
     }
     return fact;
    }
 }
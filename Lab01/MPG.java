/* 
 *  MPG.java -- starter
 *    Calculates fuel efficiency of a vehicle
 *
 *  Keyboard inputs:
 *    Vehicle description (String)
 *    Miles traveled (int)
 *    Fuel used in gallons (double)
 *
 *  Outputs:
 *    Miles per gallon
 *    Liters per kilometers
 *
 *  Nelson Villegas 
 *  2/16/2021
 *
 */

import java.util.Scanner; 

public class MPG {
   public static void main(String[] args) {
       
      // Variable declarations
      Scanner fred = new Scanner(System.in);
      String desc;
      int miles;
      double gallons;
      double mpg;
      double lpg;
      double kmpm;
      double litersPerHundred;
      
      // Prompt for user inputs
      System.out.print("What's the car? ");
      desc = fred.nextLine();
      System.out.print("How many miles? ");
      miles = fred.nextInt();
      System.out.print("How many gallons? ");
      gallons = fred.nextDouble();
      
      //Calculate the results
      mpg = miles / gallons;
      lpg = gallons / 3.7854;
      kmpm = miles / 1.609344;
      litersPerHundred = kmpm/lpg;
      
      // Print the user inputs and final results
      System.out.println("Fuel efficiency of your " + desc);
      System.out.println("You drove " + miles + " miles and used " + gallons + " gallons.");
      System.out.println("Your efficiency is " + mpg + " miles per gallon.");
      System.out.println("Your efficiency is " + litersPerHundred + " liters per 100 kilometer.");
      
      }
 }

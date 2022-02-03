// Tax.java - a program to calculate sales tax
// Nelson Villegas
// 2/17/20

import java.util.Scanner;
public class Tax {
   public static void main(String args[]) {
      // Variable declerations
      final double taxRate = 0.06;
      String desc;
      double dollar;
      double salesTax;
      double totalAmount;
      Scanner answer = new Scanner(System.in);
      
      // Prompts for user input
      System.out.print("Enter the item's description: ");
      desc = answer.nextLine();
      //Keep asking the question while dollar is less than or equal to 0
      do {
      System.out.print("Enter the cost of the item(In dollars): ");
      dollar = answer.nextDouble();
      } while(dollar<=-0);
      
      //Calculates the results
      salesTax = dollar * taxRate;
      totalAmount = dollar + salesTax;
      
      //Prints the answer
      System.out.printf("Your " +desc+ " cost %.2f.\n", dollar);
      System.out.printf("Your tax is %.2f.\n", salesTax);
      System.out.printf("The total purchase amount is %.2f.\n", totalAmount);


   }
}
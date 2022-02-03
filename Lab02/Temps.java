// Temps.Java - Converts the temperature from Fahrenheit to Celcius in a table
// Nelson Villegas
// 2/18/20


public class Temps {
   public static void main(String args[]) {
   
   // Variable declarations
   double degC;
   
   // Prints the label and the top of the table
   System.out.println("Fahrenheit\t|  Celcius");
   System.out.println("------------+------------");
   
      //Calculates the results from -20F to 220F and prints the line across Fahrenheit and Celcius
      for(int degF = -20; degF <= 220; degF += 10)
      {
         degC = (degF - 32)* 5.0/9.0;
         System.out.printf("  \t  %d\t   | %.1f\n",degF,degC);
      }
      
   //Prints an end line
   System.out.println("------------+------------");
 }
 }
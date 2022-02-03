// Speed.Java - Claculates the average speed depending on the distance and time
// Nelson Villegas
// 2/18/20

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
public class Speed {
   public static void main(String args[]) 
   {
      
      // Variable declarations
         double distance;
         double time;
         double speed;
         String question1, question2;
         int result;
         
      // Get input data
      do {
         do {
            question1 = JOptionPane.showInputDialog(null, "How many miles have you driven?");
            distance = Double.parseDouble(question1);
         } while(distance < 0);
         do {
            question2 = JOptionPane.showInputDialog(null, "How many hours did you take to get to your destination?");
            time = Double.parseDouble(question2);
         } while(time<0);
         // Calculate the result
         speed = distance/time;
      
         // Shows output
         JOptionPane.showMessageDialog(null, "The average speed is" + speed);
         result = JOptionPane.showConfirmDialog(null, "Do you want to calculate more?", "A question:", JOptionPane.YES_NO_OPTION);
      } while(result == 0);
      
      
      //The following is necessary whenever using JOptionPane!
      System.exit(0);

   }
}

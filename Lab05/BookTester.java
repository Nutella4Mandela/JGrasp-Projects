// BookTester.java - This prints all of the results from the book class
// Nelson Villegas
// 2/24/21
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.util.Random;
public class BookTester {
   public static void main(String[] args) {
   
   //Objects
   Book book1 = new Book("013478796X", "Tony Gaddis", "Starting Out With Java: From Control Structures through Data Structures", 4, "PE", 121.75);
   Book book2 = new Book("0135205972", "John Lewis", "Java Foundations: Introduction to Program Design and Data Structures", 5, "AW", 118.97);
   Book book3 = new Book("0134743350", "Harvey Deitel", "Java How to Program, Early Objects", 12, "PE", 134.84);
   
   //Fonts  
   UIManager.put("OptionPane.messageFont", new Font("Consolas", Font.BOLD, 24));
   UIManager.put("TextField.font", new Font("Consolas", Font.BOLD, 24));
   UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 18));
   
   //Variables  
   int question1; 
   int question2;
   int question3;
   double newPrice;
   
   // This asks the user if they want to change the price of the books
   // If they do, the 'price' variable becomes 'newPrice'
   question1 = JOptionPane.showConfirmDialog(null, "Do you wish to change the price of the first book?", " First Question:", JOptionPane.YES_NO_OPTION);
   if (question1 == 0) {
   newPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the new price of the first book?"));
   book1.changePrice(newPrice);
   }
   
   question2 = JOptionPane.showConfirmDialog(null, "Do you wish to change the price of the second book?", "Second Question:", JOptionPane.YES_NO_OPTION);
   if (question2 == 0) {
   newPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the new price of the second book?"));
   book2.changePrice(newPrice);
   }
   
   question3 = JOptionPane.showConfirmDialog(null, "Do you wish to change the price of the third book?", "Third Question:", JOptionPane.YES_NO_OPTION);
   if (question3 == 0) {
   newPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the new price of the third book?"));
   book3.changePrice(newPrice);
   }
   
   // This is the result from what they did and what came from the 'toString' method
   System.out.println(book1);
   System.out.println(book2);
   System.out.println(book3);
   }
   }
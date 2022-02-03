// InventoryTester.java - This prints all of the results from the book class
// Nelson Villegas
// 3/5/21
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.util.Scanner;
import java.io.*;
public class InventoryTester {
   public static void main(String[] args) throws IOException {
      UIManager.put("OptionPane.messageFont", new Font("Consolas", Font.BOLD, 24));
      UIManager.put("TextField.font", new Font("Consolas", Font.BOLD, 24));
      UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 18));

      Scanner inFile= new Scanner(new File("inventory.txt"));
      Book books;
      String inLine= inFile.nextLine();
      int size= Integer.parseInt(inLine);
      Inventory myInventory= new Inventory(size);
      String ok = "0134802217";
      while (inFile.hasNext()) {
      int changeAmt;
      double newPrice;
      inLine= inFile.nextLine();
      String[] tokens  = inLine.split("_");
      String ISBN = tokens[0];       
      String author = tokens[1]; 
      String title = tokens[2];
      int edition = Integer.parseInt(tokens[3]);
      String pubCode = tokens[4];
      int quantity = Integer.parseInt(tokens[5]);
      double price = Double.parseDouble(tokens[6]);
      if (ISBN.equals("013478796X")) {
      int question = JOptionPane.showConfirmDialog(null, "Do you wish to change the price of the book?", " Question:", JOptionPane.YES_NO_OPTION);
      if (question == 0) {
      newPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the new price of the book?"));
      myInventory.changePrice(newPrice);
      price = newPrice;
      }
      int question2 = JOptionPane.showConfirmDialog(null, "Do you wish to add more quantity for the book?", " Question:", JOptionPane.YES_NO_OPTION);
      if (question2 == 0) {
      changeAmt = Integer.parseInt(JOptionPane.showInputDialog("How much?"));
      myInventory.changeQuantity(changeAmt);
      changeAmt = quantity + changeAmt;
      if (changeAmt < 0) {
      quantity = quantity;
      }
      else{
      quantity = changeAmt;
      }
      }
      }
      myInventory.addBook(new Book(ISBN, author, title, edition, pubCode, quantity, price));
      myInventory.printInventory(); 
      }
            inFile.close();
      }
      }
      
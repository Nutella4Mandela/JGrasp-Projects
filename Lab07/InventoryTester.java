// InventoryTester.java - This prints all of the results from the book class
// Nelson Villegas
// 3/12/21
import javax.swing.UIManager;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class InventoryTester {
   public static void main(String[] args) throws IOException {
      Scanner inFile= new Scanner (new File("inventory.txt"));

      ArrayList<Book> books = new ArrayList<Book>();
      String inLine= inFile.nextLine();
      int size= Integer.parseInt(inLine);
      Inventory myInventory= new Inventory(size);
      String isbn = ""; 
      String ISBN = "";
      String author; 
      String title;
      int edition;
      String pubCode;
      int quantity;
      double price;
      int changeAmt = 0;
      double newPrice = 0;
      
      while (inFile.hasNext()) {
      inLine = inFile.nextLine();
      String []tokens  = inLine.split("_");
      ISBN = tokens[0];       
      author = tokens[1]; 
      title = tokens[2];
      edition = Integer.parseInt(tokens[3]);
      pubCode = tokens[4];
      quantity = Integer.parseInt(tokens[5]);
      price = Double.parseDouble(tokens[6]); 
      
      if (ISBN.equals("006025492X")) {
      changeAmt = -8;
      myInventory.changeQuantity(changeAmt);
      changeAmt = quantity + changeAmt;
      if (changeAmt < 0) {
      quantity = quantity;
      }
      else{
      quantity = changeAmt;      
      }
      }
      
      if (ISBN.equals("159413962X")) {
      changeAmt = 15;
      myInventory.changeQuantity(changeAmt);
      changeAmt = quantity + changeAmt;
      if (changeAmt < 0) {
      quantity = quantity;
      }
      else{
      quantity = changeAmt;
      }
      }
      
      if (ISBN.equals("0131474340")) {
      changeAmt = -5;
      myInventory.changeQuantity(changeAmt);
      changeAmt = quantity + changeAmt;
      if (changeAmt < 0) {
      quantity = quantity;
      }
      else{
      quantity = changeAmt;
      }
      }
      
      if (ISBN.equals("1403946876")) {
      changeAmt = 3;
      myInventory.changeQuantity(changeAmt);
      changeAmt = quantity + changeAmt;
      if (changeAmt < 0) {
      quantity = quantity;
      }
      else{
      quantity = changeAmt;
      }
      }
      
      if (ISBN.equals("013478796X")) {
      newPrice = 199.50;
      myInventory.changePrice(newPrice);
      price = newPrice;
      }
      if (ISBN.equals("0596100469")) {
      newPrice = 10.00;
      myInventory.changePrice(newPrice);
      price = newPrice;
      }

      

      
      myInventory.addBook(new Book(ISBN, author, title, edition, pubCode, quantity, price));
      }
      System.out.println("--------------------------------------------------------------------------------------");
      System.out.println("  ISBN        Author                        Title             ED  PC   Qty      Price");
      myInventory.printInventoryOriginal();
      System.out.println("--------------------------------------------------------------------------------------\n");

      System.out.println("--------------------------------------------------------------------------------------");
      System.out.println("  ISBN        Author                        Title             ED  PC   Qty      Price");
      myInventory.removeBook();
      myInventory.printInventory();
      System.out.println("--------------------------------------------------------------------------------------");
      inFile.close();
      }
      }
      
// Inventory.java - This class adds an array and updates them
// Nelson Villegas
// 2/24/21
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.util.Arrays;
public class Inventory {

   private Book[] books;
   private int nextEntry;
   int questionAmt;
   double price;
   int quantity;
   
   public Inventory(int size){
      size = 7; 
      books = new Book[size];
      nextEntry = 0; 
   }
   
   public boolean addBook(Book theBook) {
   for  (int nextEntry=0; nextEntry<books.length; nextEntry++)
   { books[nextEntry] = theBook; return true;}
   return false;
  }
   
   public boolean changeQuantity(int changeAmt) {
      changeAmt = quantity + changeAmt;
      if (changeAmt < 0) {
          return false;
      } 
      else {
      quantity = changeAmt;
         return true;
      }
      }
   public boolean changePrice(double newPrice) {
   price = newPrice;
   return true;
   }
   
   public void printInventory()
   {
   System.out.println(books[nextEntry]); 
   
   }
   }
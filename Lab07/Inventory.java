// Inventory.java - This class adds an array and updates them
// Nelson Villegas
// 3/12/21
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.util.ArrayList;
public class Inventory {

   private ArrayList<Book> books;
   Book theBook;
   int questionAmt;
   double price;
   int quantity;
   int newEntry;
   int i;
   String ISBN;
   String author;
   String title;
   int edition;
   String pubCode;

   public Inventory(int size){
      books = new ArrayList<Book>();
      size = books.size();
      newEntry = 0; 
   }
   
   public void addBook(Book theBook) {
   this.books.add(theBook);
   }
   
   public boolean changeQuantity(int changeAmt) {
      changeAmt = quantity + changeAmt;
      if (changeAmt < 0) {
          return true;
      } 
      else {
      quantity = changeAmt;
         return false;
      }
      }


      
   public boolean changePrice(double newPrice) {
   price = newPrice;
   return true;
   }
   
   public void removeBook() {
   books.remove(7);
   books.remove(11);
   books.remove(11);
   books.remove(5);
   }
   
   public void printInventory()
   {
   this.books.add(new Book("030795790X", "David Sibley", "The Sibley Guide to Birds", 2, "KN", 5, 39.99));
   this.books.add(new Book("1593277854", "Al Sweigart", "Invent Your Own Computer Games With Python", 4, "NS", 1, 29.95));
   this.books.add(new Book("061530611X", "Harriet Freiberger", "A History of Steamboat Springs", 1, "XX", 1, 59.99));
   for (i = 0; i < books.size(); i++) {
   System.out.println(books.get(i)); 
   }
   }
   public void printInventoryOriginal()
   {
   for (i = 0; i < books.size(); i++) {
   System.out.println(books.get(i)); 
   }
   }

   }
// Book.java - This is a class that prints out the information
// Nelson Villegas
// 3/11/21
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.lang.*;
public class Book {
   
   // Instance variables
   private String ISBN;
   private String author;
   private String title;
   private int edition;
   private String pubCode;
   private int quantity;
   private double price;
   
   //constructor
   public Book(String isbn, String author, String title, int edition, String pubCode, int quantity, double price)
   {
      this.ISBN = isbn;    
      this.author = author;
      this.title = title;
      this.edition = edition;
      this.pubCode = pubCode;    
      this.quantity = quantity;
      this.price = price; 
   }
   
   //getters
   public String getTitle(){return title;}
   public String getAuthor(){return author;}
   public double getPrice(){return price;}
   public int getEdition(){return edition;}
   public String getISBN(){return ISBN;}
   public String getpubCode(){return pubCode;}
   public int getQuantity(){return quantity;}
   
   //setters
   public void changePrice(double newPrice){price = newPrice;}
   public boolean changeQuantity(int changeAmt) {
   if ((this.quantity + changeAmt) >= 0) {
   this.quantity += changeAmt;
   return true; 
   }    
   return false; 
   }

   //This prints out all of the information once the object 'Book' is used
   public String toString() 
   {
      return (this.getISBN() + String.format(" %-16s", this.author.substring(0, Math.min(16, this.author.length()))) + String.format(" %-32s",  this.title.substring( 0, Math.min(32, this.title.length()))) + String.format("%4d", this.getEdition()) + "  " + this.getpubCode() + "  " + String.format("%4d",this.getQuantity()) + "   " + String.format("$%,8.2f", this.getPrice()));  
      }
   }
   
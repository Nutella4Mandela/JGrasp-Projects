// Book.java - This is a class that prints out the information of the book in BookTester
// Nelson Villegas
// 2/24/21
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Book {
   
   // Initiate variables
   // Note: I used the DecimalFormat so every price is always going to have 2 decimal spaces
   private static DecimalFormat df2 = new DecimalFormat("#.##");
   private String ISBN;
   private String author;
   private String title;
   private int edition;
   private String pubCode;
   private double price;
   
   //constructor
   public Book(String isbn, String auth, String ti, int ed, String pc, double pr)
   {
      ISBN = isbn;
      author = auth;
      title = ti;
      edition = ed;
      pubCode = pc;
      price = pr;
   }
   
   //getters
   public String getTitle(){return title;}
   public String getAuthor(){return author;}
   public double getPrice(){return price;}
   public int getEdition(){return edition;}
   public String getISBN(){return ISBN;}
   public String getpubCode(){return pubCode;}
   
   //setters
   public void changePrice(double newPrice){price = newPrice;} 

   //This prints out all of the information once the object 'Book' is used
   public String toString() 
   {
      return "ISBN: " +ISBN + "\nAuthor: " + author + "\nTitle: " + title + "\nEdition: " + edition + "\nPublisher Code: " + pubCode + "\nPrice: $ " +df2.format(price) + "\n\n";
   }
}
   
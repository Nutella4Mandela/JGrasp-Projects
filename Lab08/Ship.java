// Ship.java - This is a class that prints out the information to the ShipTester
// Nelson Villegas
// 3/15/21
public abstract class Ship {

   // Initiate variables
   private String name;
   private int yearBuilt;
   
   
   // Constructor
   public Ship(String nm, int yr) {
   name = nm;
   yearBuilt = yr;
   }
   
   // getters and setters
   public int getYearBuilt() {return yearBuilt;}
   public String getName() {return name;}
   
   
   public void changeName(String newName) {name = newName;}
   
   public boolean equals(Ship other) 
   {
   if (this.yearBuilt == (other.getYearBuilt()) && this.name.equals(other.getName()))
   { return true; }
   return false; }
   
   
   // Abstract methods
   public abstract boolean load(int num);
   public abstract boolean unload(int num);
   
   // The toString method prints the name and the yearBuilt
   public String toString() 
   {
      return "The " + this.name + " was built in " +yearBuilt;
   }
} 
   


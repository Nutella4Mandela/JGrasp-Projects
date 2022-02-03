// CruiseShip.java - This is linked to ship and will load and unload passengers
// Nelson Villegas
// 3/15/21
public class CruiseShip extends Ship {
   
   // Initiate variables 
   private int maxPassengers;
   private int curPassengers;
   
   // Constructor
   public CruiseShip(String name, int yearBuilt, int MP) 
   {
   super(name, yearBuilt);
   curPassengers = 0;
   maxPassengers = MP;
   }
   
   // getters
   public int getCurrentPassengers() {return curPassengers;}
   public int getMaximumPassengers() {return maxPassengers;}
   
   
   public boolean load(int num) {
    // Override the abstract load() method declared in the superclass\
    try {
    num = curPassengers + num;
      if (num > maxPassengers) {
          throw new RuntimeException("Cannot exceed maximum amount of passengers");
      } 
      else {
      curPassengers = num;
      }
       return true;
     }
     catch (NumberFormatException e) {
     throw new RuntimeException("Not a number");
     }
   }
   
   public boolean unload(int num) {
    // Override the abstract load() method declared in the superclass
    try {
    num = curPassengers - num;
      if (num < 0) {
         throw new RuntimeException("Number cannot be a negative");
      } 
      else {
      curPassengers = num;
      }
      return true; 
   }
   catch (NumberFormatException e) {
     throw new RuntimeException("Not a number");
     }
   }

   
   // The toString method will print the maxPassengers and the curPassengers
   public String toString() 
   {   
      return super.toString() + ", with the maximum load of " + maxPassengers + " Passengers, but only using " + curPassengers + ".\n";
   }
   
   }

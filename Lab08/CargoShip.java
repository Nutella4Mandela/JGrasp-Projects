// CargoShip.java
// Nelson Villegas
// 3/15/21
public class CargoShip extends Ship {

   // Initiate variables
   private int maxCargo;
   private int curCargo;
   
   // Constructor
   public CargoShip(String name, int yearBuilt, int MC) 
   {
   super(name, yearBuilt);
   curCargo = 0;
   maxCargo = MC;
   }
   
   // getters
   public int getCurrentCargo() {return curCargo;}
   public int getMaximumCargo() {return maxCargo;}
   
   
   public boolean load(int num) {
    // Override the abstract load() method declared in the superclass
    num = curCargo + num;
      if (num > maxCargo) {
          return false;
      } 
      else {
      curCargo = num;
         return true;
      }
   }
   
   public boolean unload(int num) {
    // Override the abstract load() method declared in the superclass
    num = curCargo - num;
      if (num < 0) {
          return false;
      } 
      else {
      curCargo = num;
         return true;
      }
   }
   
   // The toString method will print the maxCargo and the curCargo
   public String toString() 
   {   
      return super.toString() + ", with the maximum load of " + maxCargo + " Cargo, but only using " + curCargo + ".";
   }

   
   }


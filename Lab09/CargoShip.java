// CargoShip.java
// Nelson Villegas
// 3/15/21
import java.io.IOException;
import java.io.*;
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
    try {
    num = curCargo + num;
      if (num > maxCargo) {
          throw new RuntimeException("Cannot exceed maximum amount of cargo");
      } 
      else {
      curCargo = num;
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
    num = curCargo - num;
      if (num < 0) {
          throw new RuntimeException("Number cannot be negative");
      } 
      else {
      curCargo = num;
      }
      return true;
     }
     catch (NumberFormatException e) {
     throw new RuntimeException("Not a number");
     }
   }
   
   // The toString method will print the maxCargo and the curCargo
   public String toString() 
   {   
      return super.toString() + ", with the maximum load of " + maxCargo + " Cargo, but only using " + curCargo + ".\n";
   }

   
   }


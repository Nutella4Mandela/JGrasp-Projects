// ShipTester.java - This prints out the CruiseShip and the Cargoship linked with the Ship class, and making changes
// Nelson Villegas
// 3/15/21
import java.util.ArrayList;
public class ShipTester {
   public static void main(String[] args) {
      
      // ArrayList
      ArrayList<Ship> ship = new ArrayList<>();
      
      // The ships
      ship.add(new CruiseShip("Viola", 2010, 5000));
      ship.add(new CruiseShip("Titanic", 1912, 3547));
      ship.add(new CargoShip("Carrier", 1932, 20000));
      ship.add(new CruiseShip("Scarlet Lady", 2017, 2700));
      ship.add(new CargoShip("Anthro March", 1960, 50000));
      ship.add(new CargoShip("Merchanting", 2005, 700000));
      
      // Prints the Ships
      System.out.println("\n---------------------------------------------------------------------------------------------");
      System.out.println("--                                    Ships List                                           --");
      System.out.println("---------------------------------------------------------------------------------------------");
      printShip(ship);
      
      //This is the changes I made
      System.out.println("\n---------------------------------------------------------------------------------------------");
      System.out.println("--                               Testing Changes                                           --");
      System.out.println("---------------------------------------------------------------------------------------------");
      
      ship.get(5).changeName("Lion");
      
      System.out.println("The " + ship.get(5).getName() + " was built in " + ship.get(5).getYearBuilt() + "\n");
      
      if ( ! ship.get(0).load(5000)) System.out.println("Error: cannot exceed maximum amount of passengers.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(0).unload(2500)) System.out.println("Error: cannot subtract less than zero.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(0).load(2500)) System.out.println("Error: cannot exceed maximum amount of passengers.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(1).load(6000)) System.out.println("Error: cannot exceed maximum amount of passengers.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(1).load(2200)) System.out.println("Error: cannot exceed maximum amount of passengers.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(2).load(1000)) System.out.println("Error: cannot exceed maximum amount of cargo.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(3).load(20000)) System.out.println("Error: cannot exceed maximum amount of passengers.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(5).load(10000)) System.out.println("Error: cannot exceed maximum amount of cargo.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(5).unload(4000)) System.out.println("Error: cannot subtract less than zero.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(5).unload(5000)) System.out.println("Error: cannot subtract less than zero.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(5).unload(3000)) System.out.println("Error: cannot subtract less than zero.");
      else System.out.println("Successfully loaded.");
      
      if ( ! ship.get(5).unload(6000)) System.out.println("Error: cannot subtract less than zero.");
      else System.out.println("Successfully loaded.");
      
      
      // This prints the ship and its changes
      System.out.println("\n---------------------------------------------------------------------------------------------");
      System.out.println("--                               Final Ships List                                          --");
      System.out.println("---------------------------------------------------------------------------------------------");
      printShip(ship);
           
   
     }
   // This makes the ships into an ArrayList
   private static void printShip(ArrayList<Ship> ship) {
      for (int i=0; i < ship.size(); i++) {
         System.out.println(i + ": " + ship.get(i));
        }
      }
    }
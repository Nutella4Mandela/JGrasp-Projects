// Fleet.java - This prints out the CruiseShip and the Cargoship linked with the Ship class, and making changes
// Nelson Villegas
// 3/15/21
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.RuntimeException;
import javax.swing.JOptionPane;
public class Fleet {
// This makes the ships into an ArrayList
   private static void printShip(ArrayList<Ship> fleet) {
      for (int i=0; i < fleet.size(); i++) {
         System.out.println(i + ": " + fleet.get(i));
        }
}
   public static void main(String[] args) throws IOException {
      
      // Initializes variables
      ArrayList<Ship> fleet = new ArrayList<>();
      int max = 0;
      File file;
      Scanner inputFile = null;
      String fileName;
      String inLine;
      boolean done = false;
      String ship = "";
      String name = "";
      String newName = "";
      int current = 0;
      int year = 0;
      int num = 0;

      while (!done) {
      fileName = JOptionPane.showInputDialog("Enter the name of your file");
      
      try {
      file = new File (fileName);
      inputFile = new Scanner(file);
      System.out.println("The file was found");
      done = true;
      }
      catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage() + "\nPlease try again.");
      }
     }
      System.out.println("\n---------------------------------------------------------------------------------------------");
      System.out.println("--                               Testing Changes                                           --");
      System.out.println("---------------------------------------------------------------------------------------------");

     while (inputFile.hasNext()) {
      inLine = inputFile.nextLine();
      String []tokens = inLine.split("_");
      ship = tokens[0];
      try {
      if (ship.equals("CRUISE")) {
      name = tokens[1];
      year = Integer.parseInt(tokens[2]);
      max = Integer.parseInt(tokens[3]);
      fleet.add(new CruiseShip(name, year, max));
      }
      if (ship.equals("CARGO")) {
      name = tokens[1];
      year = Integer.parseInt(tokens[2]);
      max = Integer.parseInt(tokens[3]);
      fleet.add(new CargoShip(name, year, max));
      }
      if (ship.equals("LOAD")) {
      name = tokens[1];
      num = Integer.parseInt(tokens[2]);
      if (name.equals("Beagle")) {
      if ( ! fleet.get(0).load(num)) System.out.println("");
      else System.out.println("Successfully loaded " + num + " in " + name);
      }
      if (name.equals("Taurus")) {
      if ( ! fleet.get(5).load(num)) System.out.println("");
      else System.out.println("Successfully loaded " + num + " in " + name);
      }
      if (name.equals("Emma Maersk")) {
      if ( ! fleet.get(8).load(num)) System.out.println("");
      else System.out.println("Successfully loaded " + num + " in " + name);
      }
    }
    if (ship.equals("UNLOAD")) {
      name = tokens[1];
      num = Integer.parseInt(tokens[2]);
      if (name.equals("Beagle")) {
      if ( ! fleet.get(0).unload(num)) System.out.println("");
      else System.out.println("Successfully unloaded " + num + " in " + name);
      }
      if (name.equals("Emma Maersk")) {
      if ( ! fleet.get(8).unload(num)) System.out.println("");
      else System.out.println("Successfully unloaded " + num + " in " + name);
     }
   }
    if(ship.equals("BADKEYWORD")) {
    System.out.println("BADKEYWORD is a bad key word");
    }
    if(ship.equals("CHANGENAME")) {
    name = tokens[1];
    newName = (tokens[2]);
    fleet.get(4).changeName(newName);
    System.out.println("Change " + name + " to " + newName);
    }
   }
     catch (Exception e) {
     System.out.println(e.getMessage());
    }
  }

      
      
      
      
            
      // Prints the Ships
      System.out.println("\n---------------------------------------------------------------------------------------------");
      System.out.println("--                                    Ships List                                           --");
      System.out.println("---------------------------------------------------------------------------------------------");
      printShip(fleet);
              System.exit(0);  
     }
  }
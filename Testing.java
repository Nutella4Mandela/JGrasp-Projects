import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Testing {
   public static int factorial(int n)  {
        if (n == 0)
        return 1;
        
        return (n * factorial(n-1) );
     }
     public static void main(String[] args) {
     System.out.println(factorial(5));
   }
   }

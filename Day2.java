/*
 * Day2
 */
package hacker.rank;
import java.util.Scanner;
/**
 *
 * @author Developer
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = mealCost * (double)tipPercent/100;
        double tax = mealCost * (double)taxPercent/100;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tip + tax);
      
        // Print your result
        System.out.println("The total meal cost is" + totalCost +  "dollars.");
    }
    
}
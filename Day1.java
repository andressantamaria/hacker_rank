/*
 * Day1
 * Task: Complete the code in the editor below. The variables i, d, and s
 * are already declared and initialized for you. You must:
 * 
 * 1. Declare 3 variables: one of type int, one of type double, 
 * and one of type String.
 * 2. Read  lines of input from stdin (according to the sequence given in 
 * the Input Format section below) and initialize your variables.
 * 3. Use the + operator to perform the following operations: 
 *  1.Print the sum of  plus your int variable on a new line.
 *  2.Print the sum of  plus your double variable to a scale of one decimal place on a new line.
 *  3.Concatenate  with the string you read as input and print the result on a new line.
 */
import java.util.Scanner;

/**
 *
 * @author Andrés Santamaría Ch.
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        /*Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble; 
        String secondString;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        scan.nextLine();
        secondString = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+secondInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+secondDouble);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + secondString);

        scan.close();
    }
    
}

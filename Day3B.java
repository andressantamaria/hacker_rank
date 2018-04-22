/*
 * Task 
Given an integer, , perform the following conditional actions:

If  n is odd, print Weird
If  n is even and in the inclusive range of 2 to 5, print Not Weird
If  n is even and in the inclusive range of 6 to 20, print Weird
If  n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
 */
package hacker.rank;

import java.util.Scanner;

/**
 *
 * @author Andrés Santamaría Ch
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        scan.close();
        String ans="";
          
        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
             ans = "Weird";
        }
        else{
          
          if(n>=2 && n<=5)
              ans = "Not Weird";
                else if (n>=6 && n<=20)    
                    ans = "Weird";
                    else if (n>20)    
                        ans = "Not Weird";
         // Complete the code 
        }
        System.out.println(ans);
 
    }//fin método main    
}

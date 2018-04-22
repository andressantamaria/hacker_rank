/*
 * Given an array, A , of N integers, print A's elements in reverse
order as a single line of space-separated numbers.

Input Format

The first line contains an integer, N (the size of our array). 
The second line contains N space-separated integers describing array 's elements.
 */
package hacker.rank;

import java.util.Scanner;

/**
 *
 * @author Developer
 */
public class Day7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int n;
        String cadena;
        
        
        n = entrada.nextInt();
        entrada.nextLine();
        
        String [] a = new String[n];
        cadena = entrada.nextLine();
        
        for(int i=0; i<n; i++)
        {
            if(cadena.charAt(i)!= ' ');
                a[i]= ""+cadena.charAt(i);
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]);
        }
        
        
    }
    
}

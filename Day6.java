/*
 * Given a string, S , of length N  that is indexed from 0 to N-1 , print its 
even-indexed and odd-indexed characters as 2 space-separated strings on a single line
Note:  is considered to be an even index.

Input Format

The first line contains an integer, T (the number of test cases). 
Each line  of the  subsequent lines contain a String, S .
 */
package hacker.rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Developer
 */
public class Day6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int cantidadCadenas = entrada.nextInt();
        entrada.nextLine();
        
        String arreglo[] = new String[cantidadCadenas];
        
        //ingreso las cadenas total que voy a combinar
        for(int i=0; i<cantidadCadenas; i++)
        {
            arreglo[i]=entrada.nextLine();    
        }
        
        for(int i=0; i<arreglo.length; i++)
        {
            cadenaCombinada(arreglo, i);
        }
        
        
    }
    
    public static void cadenaCombinada(String []cadenas, int indice)
    {
        String s, odd, even;
        s=cadenas[indice];
        int size = s.length();
        //for even string index
        for(int i=0; i<size; i+=2)
        {
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
        //for odd string index
        for(int i=1; i<size; i+=2)
        {
            System.out.print(s.charAt(i));
        } 
        System.out.println();
        
    }//end method
    
}

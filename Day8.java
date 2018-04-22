/*
 * Given "n" names and phone numbers, assemble a phone book that maps friends' 
 * names to their respective phone numbers. You will then be given an unknown 
 * number of names to query your phone book for. For each "name" queried, print the 
 * associated entry from your phone book on a new line in the form name=phoneNumber; 
 * if an entry for "name" is not found, print Not found instead.
 */
package hacker.rank;
import java.util.*;
import java.io.*;
/**
 *
 * @author Developer
 */
public class Day8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String [] phoneBookNames;
        int [] phoneBooksNumbers;
        int maximum = 100000;
        
        int n = in.nextInt();
        if(n>maximum)
            n=maximum;
        
        
        phoneBookNames = new String[n];
        phoneBooksNumbers = new int [n]; 
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBookNames[i] = name;
            phoneBooksNumbers[i] = phone; 
        }
        int aux = n;
        while(in.hasNext()&&aux>0){
            String s = in.next();
            int puntero=-1;
            for(int i = 0; i < n; i++){
                if(phoneBookNames[i].equals(s))
                    puntero=i;
                   
            }
            
            if(puntero!=-1)
                System.out.println(phoneBookNames[puntero] + "=" 
                            + phoneBooksNumbers[puntero] );
            else
                    System.out.println("Not found"); 
            
            --aux;
            System.out.println("Aux:" + aux);
        }
        in.close();
        
    }//end main method
    
}

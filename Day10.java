/*
 * Task 
 * Given a base-10 integer, n , convert it to binary (base-2). Then find and print the 
 * base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
 * 
 * Sample Case: 
 * The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.
 */
package hacker.rank;
import java.util.Scanner;

/**
 *
 * @author Developer
 */
public class Day10 {

    public static String decimalToBinary(int n){
        int binario=0;
        int dividendo = n;
        int resto = 0;
        int size = 0;
        String numeroBinario = "";
        String aux = "";
     
        while(dividendo>=2){
            resto = dividendo%2;
            numeroBinario = numeroBinario + Integer.toString(resto);
            dividendo = dividendo/2;
                        
            if(dividendo == 1 || dividendo == 0)
                numeroBinario = numeroBinario + dividendo;
        }
        size = numeroBinario.length();
        for(int i = size-1; i>=0; i--){
            aux = aux + String.valueOf(numeroBinario.charAt(i)); 
        }
           
        return aux;
    }//fin método decimalToBinary
    
    public static int unosConsecutivos(String numero) {
        int consecutivos = 0;
        int size = numero.length() -1;
        int mayor = 0;
        
        
        for(int i = 0; i<=size; i++) {
            if(numero.charAt(i)=='1'){
              consecutivos += 1;
              if(consecutivos>mayor)
                  mayor=consecutivos;           
            }  
            if(numero.charAt(i)=='0')
                consecutivos=0;           
        }
        return mayor;  
    }//fin del método unosConsecutivos
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binario = decimalToBinary(n);
        System.out.println(unosConsecutivos(binario));
        
    }
    
}

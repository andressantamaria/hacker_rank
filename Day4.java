/*
 * Write a Person class with an instance variable, age , and a constructor that takes an integer,
initialAge, as a parameter. The constructor must assign initialAge to age after confirming the 
argument passed as initialAge is not negative; if a negative argument is passed as initialAge , 
the constructor should set age to 0  and print "Age is not valid", setting age to 0.. 
In addition, you must write the following instance methods:
 */
package hacker.rank;

import java.util.Scanner;

/**
 *
 * @author Developer
 */
public class Day4 
{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i<T; i++)
        {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for(int j=0; j<3; j++){
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
    
    public static class Person
    {
        private int age;
        
        public Person(int edad){
            if(edad > 0)
                age = edad;
            else
            {
                System.out.println("Age is not valid, setting age to 0.. ");
                age = 0;   
            }
        }
        
        public void yearPasses(){
            age ++;
        }
        
        public void amIOld(){
            if(age<13)
                System.out.println("your are young");
            else{ 
                if(age >=13 && age < 18)
                    System.out.println("your are a teenager");
                else
                    System.out.println("your are old");
            }   
        }
        
        
    }
    
}



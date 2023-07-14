/*Lab -1
Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. 
The program should display the factorial as the output.*/
package loops;
import java.util.Scanner;

public class CalculateFactorialNumberWhileLoop        
{  
	public static void main(String[] args)
    {  
    	//creating object of Scanner class  
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Positive Number: "); 
        
        int num = sc.nextInt(); 
        
        if (num < 0) 
        {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        
        while (num < 0)
        {
        	
        }
     
        //declaring and intializing variables   
        int fact=1; 
        int i = 1;  
  
         while( i <= num)
        {  
            fact *= i; 
            
            //increment i by 1  
            i++;               
        }     
  
        //printing the result  
        System.out.println("Factorial of " + num + " is: " + fact); 
        
        sc.close();
    }  
    
}
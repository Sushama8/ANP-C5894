/*
Exercise 1:
Write a program that prompts the user to enter a series of integers. 
The program should calculate the sum of all the even numbers entered, skipping any negative numbers. 
Use the continue statement to skip negative numbers.
*/

package loops;

import java.util.Scanner;

public class SumofEvenNoContinueBreakLoop
{
	 public static void main(String[] args) 
	 {
	        // Initialize the sum variable
	        int sumEven = 0;

	        // Create a Scanner object to read user input
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.println("Enter a series of integers (enter a negative number to skipped series.):");

	       // Keep receiving input until a negative number is entered
	       // Initialize number outside the loop
	        int number = 0; 

	        while (number >= 0) 
	        {
	            System.out.print("Enter an integer: ");
	            
	            number = sc.nextInt();

	            // Check if the number is negative
	            if (number < 0)
	            {
	                break;
	            }

	            // Check if the number is odd
	            if (number % 2 != 0) 
	            {
	                continue;
	            }

	            // Add the even number to the sum
	            sumEven += number;
	        }

	        // Print the sum of even numbers
	        System.out.println("Sum of even numbers: " + sumEven);
	        
	        sc.close();
	    }
	 
}



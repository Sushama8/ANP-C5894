/*1.Write a Java program that takes a year as input and checks if it is a leap year. 
 * If the year is divisible by 4, check if it is also divisible by 100. If it is divisible by 100, 
 * check if it is also divisible by 400. 
 * Print "Leap Year" if it satisfies all the conditions, and "Not a Leap Year" otherwise.*/





package loops;

import java.util.Scanner;

public class NestedLoop
{

	public static void main(String[] args) 
	{
		//Scanner class to take input from the user
				Scanner n=new Scanner(System.in);
				
				System.out.println("Enter a value:");
				
				
				//integer input from the user 
				int y=n.nextInt();
				
				//condition
			

			   
			    if (y % 4 == 0) {
			      System.out.println(" is a leap year.");
			    } 
			    else if (y % 100 == 0) {
			      System.out.println(" is a leap year.");
			    } 
			    else if (y % 400 == 0) {
			      System.out.println( " is a leap year.");
			    } 
			    else {
			      System.out.println( " is not a leap year.");
			    }
	
	n.close();
			      
				
	}

}

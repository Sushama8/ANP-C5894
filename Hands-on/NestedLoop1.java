/*2.Write a Java program that takes an integer as input and checks if it is divisible by 2, 3, or both. 
 * Print "Divisible by 2" if it is divisible by 2, "Divisible by 3" if it is divisible by 3, 
 * and "Divisible by both 2 and 3" if it is divisible by both.*/




package loops;

import java.util.Scanner;

public class NestedLoop1
{

	public static void main(String[] args) 
	{
		//Scanner class to take input from the user
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter a value:");
		
		
		//integer input from the user 
		int y=n.nextInt();
		
		//condition
	

		 if (y % 2 == 0 && y % 3 == 0 ) 
		 {
	            System.out.println("Divisible by both 2 and 3");
	        } else if (y % 2 == 0)
	        {
	            System.out.println("Divisible by 2");
	        } else if (y % 3 == 0)
	        {
	            System.out.println("Divisible by 3");
	        } else
	        {
	            System.out.println("Not divisible by 2 or 3");
	        }
		 n.close();
	
	}

}




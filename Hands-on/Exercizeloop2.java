package loops;

import java.util.Scanner;

/*2.Write a Java program that takes an integer as input and checks if it is divisible by 5 and 11. 
 * Print "Divisible" if it is divisible by both, and "Not Divisible" otherwise.*/

public class Exercizeloop2 {

	public static void main(String[] args) {
		//Scanner class to take input from the user
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a value:");
		
		
		//integer input from the user 
		int d=s.nextInt();
		
		//condition
		if(d%5==0 && d%11==0)
		{
			System.out.println("Divisible");
		}
		else 
		{
			System.out.println("Not Divisible");
		}
	s.close();
	
		}

}

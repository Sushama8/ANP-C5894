/*Exercise 1:
Write a Java program that takes an integer as input and checks if it is positive or negative. 
Print "Positive" if the number is greater than 0, and "Negative" if it is less than 0.*/



package loops;

import java.util.Scanner;

public class ExercizeLoop {

	public static void main(String[] args) {
		
		//Scanner class to take input from the user
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a value:");
		
		
		//integer input from the user 
		int a=s.nextInt();
		
		if(a>0)
		{
			System.out.println("Positive No.");

		}
		else 
		{
			System.out.println("Negative no.");
		}
		s.close();
		
	}

}

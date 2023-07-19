/*
 1.Write a Java program that prompts the user to enter their age.
  The program should check if the age is between 18 and 30 (inclusive) 
  and print "Eligible for Job" if true, or "Not Eligible for Job" otherwise. 
*/

package operator;
import java.util.Scanner;

public class JobEligibility
{
	 public static void main(String[] args)
	 {
	        Scanner sc = new Scanner(System.in);
	        
	        // The user to enter their age
	        System.out.print("Enter your age: ");
	        
	        // Read the age input from the user
	        int age = sc.nextInt();
	        
	        // Check if the age is between 18 and 30 (inclusive)
	        if (age >= 18 && age <= 30)
	        {
	        	// If true print "Eligible for Job"
	            System.out.println("Eligible for Job");
	        } 
	        else
	        {
	        	// If false print "Not Eligible for Job"
	            System.out.println("Not Eligible for Job");
	        }

	        sc.close();
	    }
}

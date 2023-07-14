/*Hands-on
Write a Java program that asks the user to enter a series of numbers (positive or negative) and calculates their sum. 
The program should stop asking for input when the user enters 0. 
Use a do-while loop to continuously ask for numbers and keep adding them to the sum.*/

package loops;

import java.util.Scanner;

public class NumberSumSeriesCalculator 
{
	 public static void main(String[] args) 
    {
		 
		//scanner class object
        Scanner sc = new Scanner(System.in);
        
        //variable declaration
        int num;
        int sum = 0;
      
        //do loop
        do 
        {
            System.out.print("Enter a number enter 0 to stop: ");
            num = sc.nextInt();
            sum += num;
        } 
        while (num != 0);

        System.out.println("The sum of the numbers is: " + sum);
        sc.close();
    }
	 
}

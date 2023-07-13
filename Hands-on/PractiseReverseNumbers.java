package loops;

import java.util.Scanner;

public class PractiseReverseNumbers {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
           
		System.out.print("Enter the Number: ");
	      
		int number = s.nextInt();
		
	   //reversednumber initialized to 0
        
		int reversedNumber = 0;
        
        //condition to check number is not equal to 0
       
        while (number != 0) 
        {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        s.close();
        //print reverse number
        System.out.println("Reversed number: " + reversedNumber);
    }

	
}	



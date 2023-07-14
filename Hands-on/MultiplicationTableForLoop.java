/*Lab-2
Write a Java program that prompts the user to enter a number and then prints the multiplication table of that number using a for loop. 
The table should display multiplication from 1 to 10.*/

package loops;
import java.util.Scanner; 

//class name
public class MultiplicationTableForLoop      
{
	public static void main(String[] args)
	{  
		Scanner s = new Scanner(System.in); 
		
		System.out.print("Enter number: ");    
		
		//reading a number and table is to be print  
		int num=s.nextInt();  
		
		//loop start execution form and execute until the condition i<=10 becomes false  
		for(int i=1; i <= 10; i++)  
		{  
		//prints table of the entered number      
		System.out.println(num+" * "+i+" = "+num*i);  
		}  
		s.close();
		}  
}

/*
Thursday Lab Exercise 2: Array Average

Write a program that takes the size of the array as input from the user. 
Then, prompt the user to enter elements of the array. 
Calculate and display the average of all elements in the array.
*/

package array;
import java.util.Scanner;

public class ArrayAverage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize an array to store the elements
        int[] array = new int[size];

        // Prompt the user to enter elements of the array
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of all elements in the array
        int arraySum = 0;
        for (int i = 0; i < size; i++)
        {
            arraySum += array[i];
        }

        // Calculate the average of all elements in the array
        double arrayAverage = (double) arraySum / size;

        // Display the average of all elements
        System.out.println("The average of all elements in the array is: " + arrayAverage);

        scanner.close();
    }
}

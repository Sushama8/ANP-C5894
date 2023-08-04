/*
Thursday Lab -
Question 2: Given an array of integers, write a Java program to find
the maximum and minimum elements in the array.
*/

package array;

public class MaxMinOfArray
{

    // Method to find the maximum and minimum elements in the array
    public static void findMaxMin(int[] arr)
    {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0)
        {
            throw new IllegalArgumentException("Array is null or empty.");
        }

        // Initialize variables to store the maximum and minimum values
        int max = arr[0]; 
        int min = arr[0]; 

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++)
        {
            // Update the maximum value if the current element is greater than the current maximum
            if (arr[i] > max)
            {
                max = arr[i];
            }
            // Update the minimum value if the current element is smaller than the current minimum
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }

        // Print the maximum and minimum elements
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    public static void main(String[] args)
    {
        // Sample array
        int[] array = { 1, 45, 55, 34, 15, 4 };

        try
        {
            // Call the findMaxMin method with the sample array
            findMaxMin(array);
        }
        catch (IllegalArgumentException e)
        {
            // Catch any IllegalArgumentException thrown from the findMaxMin method
            System.out.println("Error: " + e.getMessage());
        }
    }
}

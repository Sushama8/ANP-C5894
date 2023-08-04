/*
Thursday Lab -
Question 1: Write a Java program to find the average of all elements in an array of doubles.
*/

package array;

public class AverageOfArray
{

    public static double findAverage(double[] arr)
    {
        if (arr == null || arr.length == 0)
        {
            throw new IllegalArgumentException("Array is null or empty.");
        }

        double sum = 0.0;
        for (double num : arr)
        {
            sum += num;
        }

        return sum / arr.length;
    }

    public static void main(String[] args)
    {
        // Sample array
        double[] array = { 15.5, 10.3, 4.8, 15.2, 65.9 };

        try
        {
            double average = findAverage(array);
            System.out.println("Average of the elements in the array: " + average);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


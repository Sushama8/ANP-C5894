/*
Hands-On
1.Create a method to find the sum of all the elements in an ArrayList of integers. 
Test your method with a sample ArrayList
*/

package collection;

import java.util.ArrayList;

public class ArrayListSum
{

    // Method to find the sum of all the elements in an ArrayList of integers
    public static int sumArrayList(ArrayList<Integer> sampleList)
    {
        // Initialize a variable to store the sum of elements
        int sum = 0;

        // Loop through each element in the ArrayList
        for (int num : sampleList)
        {
            // Add the current element to the sum
            sum += num;
        }

        // Return the final sum
        return sum;
    }

    public static void main(String[] args)
    {
        // Sample ArrayList
        ArrayList<Integer> sampleList = new ArrayList<>();

        // Adding elements to the ArrayList
        sampleList.add(5);
        sampleList.add(10);
        sampleList.add(15);
        sampleList.add(20);

        // Calculate the sum using the sumArrayList method
        int result = sumArrayList(sampleList);

        // Print the result
        System.out.println("Sum of the elements in the ArrayList: " + result);
    }
}

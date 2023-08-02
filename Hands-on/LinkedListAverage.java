/*
Hands-On
3.Create a method to find the average of all the elements in a LinkedList of integers. 
Test your method with a sample LinkedList.
*/

package collection;
import java.util.LinkedList;

public class LinkedListAverage
{

    public static double findAverage(LinkedList<Integer> linkedList)
    {
        if (linkedList == null || linkedList.isEmpty())
        {
            throw new IllegalArgumentException("LinkedList is null or empty.");
        }

        int sum = 0;
        for (int num : linkedList)
        {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / linkedList.size();
        return average;
    }

    public static void main(String[] args)
    {
        // Sample LinkedList
        LinkedList<Integer> sampleList = new LinkedList<>();
        sampleList.add(8);
        sampleList.add(34);
        sampleList.add(1);
        sampleList.add(24);

        // Find the average using the findAverage method
        try
        {
            double result = findAverage(sampleList);
            System.out.println("Average of the elements in the LinkedList: " + result);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Hands-On
2.Create an ArrayList of strings and add the following elements: "Apple", "Banana", "Orange", "Mango", "Grapes". 
Display the elements of the ArrayList.
*/

package collection;
import java.util.ArrayList;

public class ArrayFruitList
{
    public static void main(String[] args)
    {
        // Create an ArrayList of strings
        ArrayList<String> fruitsList = new ArrayList<>();

        // Add elements to the ArrayList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");
        fruitsList.add("Grapes");

        // Display the elements of the ArrayList
        System.out.println("Elements of the ArrayList:");
        
        for (String fruit : fruitsList)
        {
            System.out.println(fruit);
        }
    }
}


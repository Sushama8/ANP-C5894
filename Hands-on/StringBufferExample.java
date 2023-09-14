package string;
/*
 * StringBuffer example.
 */
public class StringBufferExample 
{
    public static void main(String[] args) 
    {
        StringBuffer s = new StringBuffer();

        s.append("Hello, "); // Appending a string
        s.append("world!"); // Appending another string

        System.out.println(s.toString()); // Converting to a string and printing

        s.insert(7, "beautiful "); // Inserting a string at a specific index
        System.out.println(s.toString());

        s.replace(0, 6, "Greetings"); // Replacing a substring
        System.out.println(s.toString());

        s.delete(10, 19); // Deleting a substring
        System.out.println(s.toString());

        s.reverse(); // Reversing the string
        System.out.println(s.toString());
    }
}
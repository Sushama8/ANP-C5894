/*
Exercise 1: Book Class
Create a Book class with the following attributes:

title (String)
author (String)
isbn (String)
year (int)
Implement three constructors for the Book class:

Default constructor that sets default values for title, author, isbn, and year.
Constructor that takes title, author, and isbn as parameters and sets the year to the current year (use java.time.Year).
Constructor that takes all four attributes as parameters.
*/


package array;
import java.time.Year;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;

    // Default constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.year = Year.now().getValue();
    }

    // Constructor with title, author, and isbn parameters
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = Year.now().getValue();
    }

    // Constructor with all four attributes as parameters
    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }
    
   // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Year: " + year);
    }

    // Getters and Setters (optional, but good practice)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method to print Book details
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                '}';
    }

    // Example usage
    public class Main {
        public static void main(String[] args) {
            // Using the default constructor
            Book book1 = new Book();
            System.out.println("Book 1:");
            book1.displayBookInfo();

            // Using the constructor with title, author, and isbn parameters
            Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
            System.out.println("\nBook 2:");
            book2.displayBookInfo();

            // Using the constructor with all four attributes as parameters
            Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", 1960);
            System.out.println("\nBook 3:");
            book3.displayBookInfo();
        }
    }


}

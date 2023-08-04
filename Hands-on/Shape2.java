/*
Thursday Lab -
Question 3: Create a superclass called "Shape" with properties like "numSides" and "color".
Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" and
have additional properties like "sideLengths" for triangle and square, and "radius" for the circle.
Write a Java program to display the details of a triangle, a square, and a circle.
*/
package oops;

//Superclass
class Shape2
{
		protected int numSides;
		protected String color;

		public Shape2(int numSides, String color)
		{
			this.numSides = numSides;
			this.color = color;
		}
	
		public void displayDetails()
		{
			System.out.println("Number of Sides: " + numSides);
			System.out.println("Color: " + color);
		}
}

//Subclass "Triangle"
class Triangle extends Shape2
{
		 private double[] sideLengths;
		
		 public Triangle(double[] sideLengths, String color)
		 {
		     super(3, color);
		     this.sideLengths = sideLengths;
		 }
	
		 @Override
		 public void displayDetails()
		 {
		     super.displayDetails();
		     System.out.println("Triangle Side Lengths: " + sideLengths[0] + ", " + sideLengths[1] + ", " + sideLengths[2]);
		 }
}

//Subclass "Square"
class Square extends Shape2
{
		 private double sideLength;
		
		 public Square(double sideLength, String color)
		 {
		     super(4, color);
		     this.sideLength = sideLength;
		 }
		
		 @Override
		 public void displayDetails()
		 {
		     super.displayDetails();
		     System.out.println("Square Side Length: " + sideLength);
		 }
}

//Subclass "Circle"
class Circle extends Shape2
{
		 private double radius;
		
		 public Circle(double radius, String color)
		 {
		     super(0, color); // Circle has no sides, so numSides is set to 0.
		     this.radius = radius;
		 }
		
		 @Override
		 public void displayDetails()
		 {
		     super.displayDetails();
		     System.out.println("Circle Radius: " + radius);
		 }
}

class Shape2Main
{
 public static void main(String[] args)
		 {
		     Triangle triangle = new Triangle(new double[]{5.0, 6.0, 7.0}, "Red");
		     Square square = new Square(4.5, "Blue");
		     Circle circle = new Circle(3.0, "Green");
		
		     System.out.println("Triangle Details:");
		     triangle.displayDetails();
		
		     System.out.println("\nSquare Details:");
		     square.displayDetails();
		
		     System.out.println("\nCircle Details:");
		     circle.displayDetails();
		 }
}

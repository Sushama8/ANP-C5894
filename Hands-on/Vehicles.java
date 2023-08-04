/*
Thursday Lab -
Question 4: Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()".
Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class and implement the abstract methods.
Write a Java program to demonstrate starting and stopping operations for a car and a motorcycle.
*/

package oops;

//Abstract class "Vehicles"
abstract class Vehicles
		{
		 public abstract void start();
		 public abstract void stop();
		}

//Subclass "Car"
		class Cars extends Vehicles
		{
		 @Override
		 public void start()
		 {
		     System.out.println("Car started. Ready to go!");
		 }
		
		 @Override
		 public void stop()
		 {
		     System.out.println("Car stopped.");
		 }
}

//Subclass "Motorcycle"
class Motorcycle extends Vehicles
{
		 @Override
		 public void start()
		 {
		     System.out.println("Motorcycle started. Let's ride!");
		 }
		
		 @Override
		 public void stop()
		 {
		     System.out.println("Motorcycle stopped.");
		 }
}

class VehiclesMain
{
 public static void main(String[] args)
		 {
		     Vehicles cars = new Cars();
		     Vehicles motorcycle = new Motorcycle();
		
		     System.out.println("Starting operations:");
		     cars.start();
		     motorcycle.start();
		
		     System.out.println("\nStopping operations:");
		     cars.stop();
		     motorcycle.stop();
		 }
}


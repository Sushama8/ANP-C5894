/* Example of Multilevel inheritance -
  Create a class called Vehicle with attributes brand and year. Implement a method displayInfo() in the Vehicle class that prints the brand and year of the vehicle. 
  Create a child class Car that inherits from Vehicle and adds an attribute model. Create another child class SportsCar that inherits from Car and adds an attribute topSpeed. 
  Override the displayInfo() method in the SportsCar class to display the brand, model, year, and top speed of the sports car */

package oops;


class Vehicle 
{
	String brand;
	int year;
	
	
		public void displayInfo()
		{
			System.out.println("Brand and year of the vehicle is.... ");
		}	
}

class Car extends Vehicle
{
	String model;
		//public void displayInfo()
		{
			System.out.println("Brand and year of the vehicle is..... ");
		}	
}

class SportsCar extends Car
{
	int topSpeed;
	
	    @Override
		public void displayInfo()
		{
			System.out.println("Brand, year, model and top speed of the sports car is... ");
		}
}

class VehicleMain
{
	public static void main(String[] args) 
	{
		
	//creating object of sub class
		
	 SportsCar s = new SportsCar();
	 s.brand ="Mahindra" ;
	 s.model =" 10A ";
	 s.year = 2000;
	 s.topSpeed = 180;
	 s.displayInfo();
	 
	 //access fields and methods
			 
     System.out.println("Brand name is : "+ s.brand );
     System.out.println("year is : "+ s.year );
	 System.out.println("Model name is : "+ s.model );
	 System.out.println("topSpeed is : "+ s.topSpeed );
	
	}
}
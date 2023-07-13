/* 3.Create a class called "Animal" with instance variables "name" and "age".
 *  Implement getter and setter methods for both variables. 
 *  Create a subclass called "Dog" that inherits from "Animal" and adds an instance variable called "breed".
 *   Implement getter and setter methods for the "breed" variable. 
 * Write a main method to create an instance of the "Dog" class, demonstrate the inheritance by accessing and modifying the variables using the getter 
 * and setter methods.*/



package oops;

public class AnimalInfo 
{
	 private String name;
	 private int age;
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	 
	}
class Goat extends AnimalInfo
{
	private String breed;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}

class AnimalInfoMain
{
	public static void main(String[] args)
 	{
 		//Creating instance of class PersonInfo
 		Goat g = new Goat();
 		
 		//Setting values
 		g.setName("Goat");
		g.setAge(2);
 		g.setBreed ("Afar");
 		
 		//Print values
 		System.out.println("Name is:" + g.getName());
 		System.out.println("Age is:" + g.getAge());
 		System.out.println("Breed is:" + g.getBreed());
 		
 }	

}


package oops;

//super class or base class or parent class
// Example of Single level Inheritance


class Animal 
{
//fields = name & methods= eat()
	
	String name;
	
	public void eat()
	
	{
		System.out.println("Animal Eat....");
	}
}


//inherit from Animal

class Dog extends Animal
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	
	public void sound()
	{
		System.out.println("Dog Barks....");
	}
}


class AnimalMain
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Dog d=new Dog();
		
		//access fields and methods
		d.name="Moti";
		d.eat();
		d.sound();
		
	}

}
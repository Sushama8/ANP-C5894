package oops;

class Shape {

	// methods= calculateArea()
	
			
			public void calculateArea()
			
			{
				System.out.println("calculate area of shape");
			}
		}


		//inherit from shape

		class Rectangle extends Shape
		{
			//fields & methods of shape class
			//fields & methods of rectangle class
			@Override
			public void calculateArea()
			{
				System.out.println("calculate area of rectangle");
			}
		}


		class ShapeMain
		{
			public static void main(String[] args)
			{
				//creating object of sub class
				Rectangle r=new Rectangle();
				
				//access fields and methods
				r.calculateArea();
				
			}
		
}

package oops;
//Example of Student

class Student
{
	private int rollno;
	private String name;
	private int age;
	private String address;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
class Info
{
	public static void main(String[] args)
	{
		//Creating instance of class Student
		Student s=new Student();
		
		//Setting values
		s.setRollno(16);
		s.setName("Sushama");
		s.setAge(23);
		s.setAddress("Sindhudurg");
		
		//Print values
		System.out.println("Roll no is:" + s.getRollno());
		System.out.println("Name is:" + s.getName());
		System.out.println("Age is:" + s.getAge());
		System.out.println("Address is:" + s.getAddress());
		
	}
}
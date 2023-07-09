package oops;


class PersonInfo
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


 class Employ extends PersonInfo
 {
	 int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
 }
 
  
 class Manager extends Employ
 {
	 String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
 }
 
 
 class PersonInfoMain

 {
 	public static void main(String[] args)
 	{
 		//Creating instance of class PersonInfo
 		Manager e = new Manager();
 		
 		//Setting values
 		e.setName("Sushama");
		e.setAge(23);
 		e.setSalary (28000);
 		e.setDepartment("cashier");
 		
 		//Print values
 		System.out.println("Name is:" + e.getName());
 		System.out.println("Age is:" + e.getAge());
 		System.out.println("Salary is:" + e.getSalary());
 		System.out.println("Department is:" + e.getDepartment());
 }
 }
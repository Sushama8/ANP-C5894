package oops;

class Employee
{
	private String name;
	private String jobtitle;
	private int age;
	private int mobileno;
	private int employeeid;
	private String companyaddress;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getCompanyaddress() {
		return companyaddress;
	}
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	
	
}

class Employeeinfo
{
	public static void main(String[] args)
	{
		//Creating instance of class Student
		Employee e=new Employee();
		
		//Setting values
		e.setName("Mr.Anil Naik");
		e.setJobtitle("Software Developer");
		e.setAge(45);
		e.setMobileno(78654321);
		e.setEmployeeid(76);
		e.setCompanyaddress("Located in Pune");
		
		//Print values
		System.out.println("Name is:" + e.getName());
		System.out.println("Jobtitle is:" + e.getJobtitle());
		System.out.println("Age is:" + e.getAge());
		System.out.println("Mobileno is:" + e.getMobileno());
		System.out.println("Employeeid is:" + e.getEmployeeid());
		System.out.println("Companyaddress is:" + e.getCompanyaddress());
		
	}



}

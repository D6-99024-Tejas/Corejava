/*Create a class called Employee that includes 
 * three instance variables—a 
first name (type String), a last name (type String) and a monthly salary 
(double). 
Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. 
If the monthly salary is not positive, do not set its value. 
Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s yearly salary again. */

package assignment2;

public class Employee {
	private String fname;
	private String lname;
	private double salary;
	
	public Employee(String fname,String lname,double salary)
	{
		this.fname=fname;
		this.lname=lname;
		if(salary<0)
		{
			this.salary=0;
		}
		else {
			this.salary=salary;
		}
	
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void show()
	{
		System.out.println("first name is : "+fname);
		System.out.println("last name is : "+lname);
		System.out.println("salary is : "+salary);
	}
	
	public double newSalary()
	{
		double newsalary= salary % 10;
		salary = salary + newsalary;
		return salary;
	}
}

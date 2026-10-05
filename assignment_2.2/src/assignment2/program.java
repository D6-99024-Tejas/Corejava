package assignment2;

public class program {

	public static void main(String[] args) {
		Employee e=new Employee("dhole", "tejas", 40000);
		Employee e2=new Employee("kale", "mayur", 40000);
		
		//System.out.println("1St employee : " + e.show());
		//System.out.println("2nd employee : "+ e2.show());
	System.out.println("1st employee:");
	e.show();
	System.out.println("new salary");
	e.newSalary();
	System.out.println("2nd Employee: ");
	e2.show();
	System.out.println("new salary");
	e2.newSalary();
	}
}

package Stackk;

public class FixedStack  implements stack{
	private Employee[]arr=new Employee[STACK_SIZE];
	private int top = -1;
	@Override
	public void push(Employee e) {
		if(top == arr.length -1)
		{
			System.out.println("Fixed stack if FULL");
			return;
		}
		else {
			arr[++top]=e;
			System.out.println("Employeed Pushed Successfully");
		}
	}
	@Override
	public Employee pop() {
		if(top ==-1)
		{
			System.out.println("Satck is empty");
			return null;
		}
		return arr[top--];
	}
	@Override
	public void display() {
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.println("Employee in stack");
		for(int i = top; i>=0 ; i--)
		{
			System.out.println(arr[i]);
		}
	}

}

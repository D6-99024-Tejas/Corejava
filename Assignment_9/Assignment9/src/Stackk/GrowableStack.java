package Stackk;

public class GrowableStack implements stack {
	private Employee[]arr = new Employee[STACK_SIZE];
	private int top = -1;
	
	@Override
	public void push(Employee e) {
		if(top == arr.length - 1)
		{
			Employee[] temp = new Employee[arr.length * 2];
			
			for(int i =0; i<arr.length; i++)
			{
				temp[i] = arr[i];
			}
			arr = temp;
			System.out.println("Stack size increased.");
		}
		
		arr[++top] = e;
		System.out.println("Employee pushed Successfully");
	}
	@Override
	public Employee pop() {
		if (top == -1)
		{
			System.out.println("stack is Empty");
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
		System.out.println("Employees in Stack:");

	    for (int i = top; i >= 0; i--) {
	        System.out.println(arr[i]);
	    }
	}
	

}

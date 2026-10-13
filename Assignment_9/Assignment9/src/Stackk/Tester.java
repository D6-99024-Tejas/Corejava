package Stackk;

import java.util.Scanner;

public class Tester {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		stack s = null;
		int choice;
		
		do {
			System.out.println("EMPLOYEE STACK MENU");
			System.out.println("1. Choose Fixed Stack");
			System.out.println("2. Choose Growable Stack");
			System.out.println("3. Push Employee");
			System.out.println("4. Pop Employee");
			System.out.println("5. Display Stack");
			System.out.println("6. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				if(s == null)
				{
					s = new FixedStack();
					System.out.println("Fixed stack selected");
				}
				else {
					System.out.println("stack already selected");
				}
				break;
			case 2:
				if(s == null)
				{
					s = new GrowableStack();
					System.out.println("growable satck selected");
				}
				else {
					System.out.println("stack already selected");
				}
				break;
			case 3:
				if(s == null)
				{
					System.out.println("No stack choosen");

				}
				else {
					System.out.println("enter employee Id : ");
					int id = sc.nextInt();
					sc.nextLine();
					
					System.out.println("enter employee name : ");
					String name = sc.nextLine();
					
					System.out.println("enter employee salary : ");
					double salary = sc.nextDouble();
					
					Employee e = new Employee(id, name, salary);
					s.push(e);
				}
				break;
				case 4:
					 if (s == null) {
	                        System.out.println("NO stack chosen !!!");
	                    } else {
	                        Employee e = s.pop();

	                        if (e != null) {
	                            System.out.println("Popped Employee: " + e);
	                        }
	                    }
					break;
				case 5:
					if(s == null)
					{
						System.out.println("No satck choosen");
					}
					else {
						{
							s.display();
						}
					}
					break;
				case 6:
					System.out.println("Exiting program...");
					break;

			default:
				System.out.println("Invalid choice");
				
			} 
		}	while(choice !=6);
			sc.close();

		
	}
	
}

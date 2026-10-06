/*(Credit Limit Calculator) 
Develop a Java application that determines whether any of several 
department-store customers has exceeded the credit limit on a 
charge account. 
For each customer,the following facts are available: 
a) account number 
b) balance at the beginning of the month 
c) total of all items charged by the customer this month 
d) total of all credits applied to the customer’s account this 
month 
e) allowed credit limit. 
The program should input all these facts as integers, calculate 
the new balance (= beginning balance+ charges – credits), 
display the new balance and determine whether the new balance 
exceeds the customer’s credit limit. For those customers whose 
credit limit is exceeded, the program should display 
the message "Credit limit exceeded". */

import java.security.PrivateKey;
import java.util.Scanner;

public class CustomerStore {
 
	private int ac;
	private int b_balance;
	private int charges;
	private int credits;
	private int limitcredit;
	public CustomerStore()
	{}
	public CustomerStore(int ac, int b_balance, int charges, int credits, int limitcredit) {
		super();
		this.ac = ac;
		this.b_balance = b_balance;
		this.charges = charges;
		this.credits = credits;
		this.limitcredit = limitcredit;
	}
	public double newBalance()
	{
		double new_balance= (b_balance+charges)-credits;
		System.out.println("new balance : "+new_balance);
		return new_balance;
		
	}
	public void getdata()
	{ Scanner sc = new Scanner(System.in);
		System.out.println("account number: ");
		ac=sc.nextInt();
		System.out.println("Beggining balance : ");
		b_balance=sc.nextInt();
		System.out.println("totol charges : ");
		charges=sc.nextInt();
		System.out.println("total credits : " );
		credits=sc.nextInt();
		System.out.println("Credit limit : ");
		limitcredit=sc.nextInt();
	}
	public void display()
	{
		System.out.println("-------------------");
		System.out.println("account number: "+ac);
		System.out.println("Beggining balance : "+b_balance);
		System.out.println("totol charges : "+charges);
		System.out.println("total credits : "+credits );
		System.out.println("Credit limit : "+limitcredit);
	}
	public void compare()
	{
		if(credits>limitcredit)
		{
			System.err.println(ac+" member "+"Credit limit exceeded");
		}
	}
	
	
}

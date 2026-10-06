/*Write TestPoint class , in package "tester" , with a main method, Accept co 
ordinates of 2 points from user (Scanner) --to create 2 points (p1 & p2) 
Use getDetails method to display point details.(p1's details & p2's details) 
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located 
at the same position) 
If they are not located at the same position , display distance between p1 & 
p2*/
package tester;

import java.util.Scanner;

import com.app.geometry.Points2D;

public class TestPoint {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.err.println("enter first X:");
		double x1=sc.nextDouble();
		
		System.out.println("enter 1st y");
		double y1=sc.nextDouble();
		
		System.out.println("enter 2nd x");
		double x2=sc.nextDouble();
		
		System.out.println("enter 2nd y");
		double y2=sc.nextDouble();
		
		Points2D p1=new Points2D(x1, y1);
		Points2D p2=new Points2D(x2, y2);
		
		if(p1.equals(p2))
		{
			System.err.println("both points are same");
		}
		else {
			Double distance= p1.calculateDistance(p2);
					System.out.println("Distance is : "+distance);
		}
	}
}

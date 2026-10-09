/*Q1) Write a java program to reverse a String 
*/
package arrrays;

import java.util.Scanner;

public class Reversee {

	public static void main1(String[] args) {
		String str = "Tejas";
		String s2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s2 = s2 + str.charAt(i);
		}
		System.out.println(s2);
	}

	/* Q2) Write a java code to check string is palindrome. */
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number u want to check for palindrome: ");

		String num = sc.nextLine();
		String num2 = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			num2 = num2 + num.charAt(i);
		}
		System.out.println("reverse is : " + num2);

		if (num.equals(num2)) {
			System.out.println("This string are palindrome");
		} else {
			System.out.println("This string are not palindrome");
		}
		sc.close();
	}

	/*write a java program to count number of words in a String. Hint: You can use, trim() , length() and split() methods
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inter String :");
		String str = sc.nextLine();

		//String str2 = str.trim();
		if (str.length() == 0) {

			System.out.println("length is :" + str.length());
		} else {
			String[] parts = str.trim().split(" ");
			System.out.println(parts.length);
			sc.close();
		}
		/*Q4) Write an enum type TrafficLight, whose constants (RED, 
GREEN, YELLOW) take one parameter—the duration of the 
light.Write a program to test the TrafficLight enum so that it 
displays the enum constants and their durations. */

	}
}

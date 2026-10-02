/*1. Accept a integer number and when the program is executed print the 
binary, octal and hexadecimal equivalent of the given number. 
Sample Output: 
java Test 
Enter Number : 20 
Given Number :20 
Binary equivalent :10100 
Octal equivalent :24 
Hexadecimal equivalent :14 
Hint : toBinaryString() , toOctalString(), toHexString() */
import java.util.Scanner;
public class integer {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number : ");
		int num=sc.nextInt();
		sc.close();
		
		System.out.println("Given number : "+num);
		System.out.println("Binary equivalent :"+Integer.toBinaryString(num));
		System.out.println("Octal equivalent :"+Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent :"+Integer.toHexString(num));
		

	}

}

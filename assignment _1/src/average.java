/*Accept 2 double values from User (using Scanner). Check data type. If 
arguments are not doubles, supply suitable error message & terminate. 
If numbers are double values, print its average.*/
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Please enter a valid double value.");      
            return;
            
        }
        double num1 = sc.nextDouble();
        System.out.print("Enter second value : ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Please enter a valid double value.");           
            return;
        }
        double num2 = sc.nextDouble();
        double average = (num1 + num2) / 2;
        System.out.println("Average = " + average);
        sc.close();
        
    }
}
/*Write a Java program to create a new array list, add some colors (string) 
and print out the collection as sorted list. */

import java.util.ArrayList;
import java.util.Collections;

public class colours {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Pich");
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Navy Blue");
		colors.add("Black");
		
		Collections.sort(colors);
		
		System.out.println("Sorted Colors : "+colors);
	}

}

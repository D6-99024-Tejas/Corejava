package com.Exception;


public class program {
	public static void main(String[]args)
	{
		 Circle circle = new Circle();
        //System.out.println("Initial Circle Center: (" + circle.getMyX() + ", " + circle.getMyY() + ")");
        //System.out.println("Initial Circle Diameter: " + circle.getDiameter());

        // Set a new diameter
        try {
            circle.setMyDiameter(150);
            System.out.println("Updated Circle Diameter: " + circle.getDiameter());
        } catch (DiameterException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("");
        
        System.out.println("");

        // Attempt to set a negative diameter
        try {
            circle.setMyDiameter(-50);
            System.out.println("Updated Circle Diameter: " + circle.getDiameter());
        } catch (DiameterException e) {
            System.out.println(e.getMessage());
        }
	}
}

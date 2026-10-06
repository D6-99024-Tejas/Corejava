/* Create a class Point2D , in package - "com.app.geometry"   : for representing 
a point in x-y co-ordinate system. Create a parameterized constructor to init 
x & y co-ords. Add a method to return string form of  point's x & y co-ords  
Hint :  public String getDetails())  
Add isEqual method to Point2D class :a boolean returning method : must 
return true if n only if both points are having same x,y co-ords or false 
otherwise. 
Add calculateDistance method to calculate distance between current point 
and specified point & return the distance to the caller. 
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow 
etc. 
*/

package com.app.geometry;

import java.awt.geom.Point2D;

public class Points2D {
	private double x;
	private double y;
	public Points2D(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String getDetails()
	{
		return "Point(" + x + ", " + y + ")";
		
	}
	public boolean isEqual(Points2D p) {
        return this.x == p.x && this.y == p.y;
    }
	public double calculateDistance(Points2D p) 
	{
		double dx = p.x - this.x;
        double dy = p.y - this.y;
        double temp= Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
        return temp;
        
	}
}

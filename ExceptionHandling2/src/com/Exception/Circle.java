package com.Exception;

/**
 * 
 */
public class Circle {
 private double myX;
 private double myY;
 private double diameter;
 
 public Circle()
 {	 
	 this.myX=0;
	 this.myY=0;
	 this.diameter=100;
 }
 public Circle(double x,double y,double d) throws DiameterException
 {
	 
	 this.myX=x;
	 this.myY=y;
	 this.diameter=d;
 }

 public double getMyX() {
	return myX;
}
 
 public double getMyY() {
	return myY;
 }
 
 public double getDiameter() {
	return diameter;
 }

 public void setMyCenter(double x,double y)
 {
	 this.myX=x;
	 this.myY=y;
 }
 public void setMyDiameter(double diameter) throws DiameterException {
     if (diameter < 0) {
         throw new DiameterException();
     }
     this.diameter = diameter;
 }

 
 
 
 
}

/* Store book details in a library in a list -- ArrayList.
Book details: is bn(string), price(double), authorName(string), quantity(int)
*/

package com.domain;

public class Book implements Comparable<Book>{
	private String bn;
	private double price;
	private String autherName;
	private int Quantity;
	
	public Book()
	{
		super();
	}
	
	

	public Book(String bn, double price, String autherName, int quantity) {
		this.bn = bn;
		this.price = price;
		this.autherName = autherName;
		this.Quantity = quantity;
	}


	public String getBn() {
		return bn;
	}


	public void setBn(String bn) {
		this.bn = bn;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAutherName() {
		return autherName;
	}


	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}


	public int getQuantity() {
		return Quantity;
	}


	public void setQuantity(int quantity) {
		Quantity = quantity;
	}


	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String toString() {
		return String.format("%-20s%-15f%-10.2s%-20d",bn,price,autherName,Quantity);
	}
	
	

}

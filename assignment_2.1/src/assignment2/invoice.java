package assignment2;

public class invoice {

	public static void main(String[] args) {
		hardware h= new hardware("101","iron",5,200);
		System.out.println("part number :"+h.getpNum());
		System.out.println("Description :"+h.getDesc());
		System.out.println("Quantity :"+h.getQty());
		System.out.println("Price :"+h.getPrice());
		
		System.out.println("Invice is :"+h.getinvoice());
	}

}

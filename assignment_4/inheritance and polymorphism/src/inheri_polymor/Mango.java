package inheri_polymor;

import java.util.Scanner;

public class Mango extends fruit {
	public Mango(String name,String color,double weight)
	{
		super(color, weight, name);
	}
	@Override
	public String taste()
	{
		return "Sweet";
	}
	
}

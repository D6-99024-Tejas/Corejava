package inheri_polymor;

import java.util.jar.Attributes.Name;

public abstract class fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public fruit(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public boolean getIsFresh() 
	{
		return isFresh;
	}

	public void setIsFresh(boolean isFresh) {
        this.isFresh = isFresh;
	}
	@Override
	public String toString()
	{
		return "Name "+name+"color"+color+"weight"+weight;
	}
	public abstract String taste();
}

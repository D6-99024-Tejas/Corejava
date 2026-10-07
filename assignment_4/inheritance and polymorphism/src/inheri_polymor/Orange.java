/*1)  Apply inheritance n polymorphism 
a)  Arrange Fruit, Apple, Orange, Mango in inheritance hierarchy 
b)  Properties (instance variables) : color: String, weight : double , name: String, isFresh:   
boolean 
c)  Add suitable constructors. 
d) Override toString correctly to return state of all fruits (including: name ,color , weight ) 
e)  Add a taste() method : public String taste() which will be an abstract method 
Apple: should return "sweet and sour” 
Mango: should return "sweet"  
Orange: should return "sour" 
f) Add all of above classes under the package "com.app.fruits" 
g) Create a Class FruitBasket , with main method inside it. Use it for testing 
h) Prompt user for the basket size n create suitable data structure and give options 
*/

package inheri_polymor;

public class Orange extends fruit {
	public Orange (String name,String color,double weight)
	{
		super(color, weight, name);
	}
	@Override
	public String taste()
	{
		return "sour";
	}
}

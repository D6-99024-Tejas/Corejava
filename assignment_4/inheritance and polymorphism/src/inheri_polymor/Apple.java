package inheri_polymor;

public class Apple extends fruit {
	public Apple(String name, String color, double weight) {
		super(name, weight, color);
	}

	@Override
	public String taste() {
		return "sweet and Sour";
	}
}

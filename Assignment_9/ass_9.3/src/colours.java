import java.util.ArrayList;

public class colours {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("pich");
		colors.add("yellow");
		colors.add("Red");
		colors.add("green");
		colors.add("pink");
		
		System.out.println("Before Update : "+colors);
		
		colors.set(3, "Orange");
		
		System.out.println("After Update : "+colors);
	}

}

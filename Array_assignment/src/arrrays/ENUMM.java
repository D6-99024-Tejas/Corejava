package arrrays;
enum TrafficLight{
	Red(60),
	Green(60),
	Yellow(10);
	
	private int duration;
	
	TrafficLight(int duration)
	{
		this.duration=duration;
	}
	
	public int getDuration()
	{
		return duration;
	}
}

public class ENUMM {
	
	public static void main(String[] args) {
		

	        for (TrafficLight light : TrafficLight.values()) {

	            System.out.println( light + " = " + light.getDuration() + " seconds"
	            );
	        }
	}
}



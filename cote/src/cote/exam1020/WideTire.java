package cote.exam1020;

public class WideTire extends Tire{
	private int width;
	
	public WideTire(String model, int maxRoll, int width) {
		super(model, maxRoll);
		this.width = width;
	}
}

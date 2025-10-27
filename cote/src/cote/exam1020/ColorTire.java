package cote.exam1020;

public class ColorTire extends Tire{
	private String color;
	
	public ColorTire(String model, int maxRoll, String color) {
		super(model, maxRoll);
		this.color = color;
	}
}

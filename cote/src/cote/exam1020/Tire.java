package cote.exam1020;

public class Tire {
	protected String model;
	protected int maxRoll;
	protected int roll = 0;
	
	public Tire(String model, int maxRoll) {
		this.model = model;
		this.maxRoll = maxRoll;
	}
	
	public boolean roll() {
		if (roll >= maxRoll) {
			return false;
		}else {
			roll++;
			return true;
		}
	}
}

package cote.exam1013;

public class CheesePizza extends Pizza{

	public CheesePizza() {this("M");}
	public CheesePizza(String size) {
		this.name = "Cheese Pizza";
		this.size = size;
		this.prices = new int[] {10000, 15000, 25000};
	}
}

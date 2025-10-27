package cote.exam1013;

public class PepperoniPizza extends Pizza{
	
	public PepperoniPizza() {this("M");}
	public PepperoniPizza(String size) {
		this.name = "Pepperoni Pizza";
		this.size = size;
		this.prices = new int[] {12000, 18000, 29000};
		this.topping = "pepperoni";
	}
	
	@Override
	public void cook() {
		System.out.println(topping + "을 추가합니다.");
		super.cook();
	}
}

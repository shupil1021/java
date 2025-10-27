package cote.exam1013;

public class ShrimpPizza extends Pizza{
	
	public ShrimpPizza() {this("M");}
	public ShrimpPizza(String size) {
		this.name = "Shrimp Pizza";
		this.size = size;
		this.prices = new int[] {14000, 20000, 32000};
		this.topping = "shrimp";
	}
	
	@Override
	public void cook() {
		System.out.println(topping + "을 추가합니다.");
		super.cook();
	}
}

package cote.exam1013;

import java.util.Scanner;

public class PizzaExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String size = sc.next();
		sc.close();
		
		Pizza pizza = null;
		if (name.equals("C")) {
			pizza = new CheesePizza(size);
		} else if(name.equals("P")) {
			pizza = new PepperoniPizza(size);
		} else if(name.equals("S")) {
			pizza = new ShrimpPizza(size);
		}
		
		pizza.cook();
		pizza.serve();
	}

}

package cote.exam1013;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("카스테라", 5500);
		menus[1] = new Menu("초코 마카롱", 3500);
		menus[2] = new Menu("쇼토 케이크", 7500);
		
		OrderItem item = new OrderItem(menus[0], 3);
		
		System.out.println(item.price());
		
	}

}

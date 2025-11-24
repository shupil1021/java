package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer("cust1", "1");
		Customer cust2 = new Customer("cust2", "1", 100);
		
		System.out.println(cust1.updatePoint(50));
		System.out.println(cust2.updatePoint(-50));
		System.out.println(cust2.setPoint(200));
	}

}

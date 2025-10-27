package cote.exam1020;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount("김이름", "1234");
		BankAccount bank2 = new BankAccount("김이룸", "12345", 1000);
		
		System.out.println(bank.getCount());
		
		System.out.println(bank.deposit(10000));
		
		System.out.println(bank.withdrawal(5000));
		System.out.println(bank.withdrawal(6000));
	}

}

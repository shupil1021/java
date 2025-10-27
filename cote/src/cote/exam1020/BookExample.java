package cote.exam1020;

public class BookExample {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("리버싱 지침서c.1", "누구더라", "100-누72-102");
		books[1] = new Book("리버싱 지침서c.2", "누구더라", "100-누72-102");
		books[2] = new Book("리버싱 지침서c.3", "누구더라", "100-누72-102");
		for(Book book : books) {
			System.out.println(book.getTitle());
		}
	}

}

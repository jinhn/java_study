package file.demo;

public class BookApp {

	public static void main(String[] args) throws Exception {
		Bookstore store = new Bookstore();

		store.addBook(new Book("가나다라", "마바사", "아자차", 20000));
		
		store.displayBooks();
		
		store.saveBooks();
		
	}
}
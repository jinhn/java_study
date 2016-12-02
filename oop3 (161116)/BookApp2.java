public class BookApp2 {
	public static void main(String[] args) {
	
		Book[] bookCart = new Book[2];

		Book book1 = new Book();
		book1.setNo(23);
		book1.setTitle("하둡 인 액션");
		book1.setAuther("척  램");
		book1.setPublisher("지앤선");
		book1.setPrice(30000);
		book1.setPubdate("2014-01-05");

		Book book2 = new Book();
		book2.setNo(25);
		book2.setTitle("자바 웹 프로그래밍");
		book2.setAuther("박재성");
		book2.setPublisher("가메출판사");
		book2.setPrice(28000);
		book2.setPubdate("2016-07-05");

		bookCart[0] = book1;
		bookCart[1] = book2;

		for (Book bk : bookCart) {
			System.out.printf("%d %s %s %s %d %s\n"
			, bk.getNo(), bk.getTitle(), bk.getAuthor(), bk.getPublisher(), bk.getPrice(), bk.getPubdate());
		}
	}
}
package file.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Bookstore {

	ArrayList<Book> list = new ArrayList<>();
	
	public Bookstore() throws IOException {
		loadBookData();
	}
	
	private void loadBookData() throws IOException {
		// books.txt 파일을 읽어서 책정보를 ArrayList에 담기
		// BufferedReader를 사용해서 파일내용 읽기
		
		BufferedReader br = new BufferedReader(new FileReader("books.txt"));
		String text = null;
		
		while ((text=br.readLine()) != null) {
			Book book = new Book();
			String arr[] = text.split(",");
			book.setTitle(arr[0]);
			book.setAuther(arr[1]);
			book.setPub(arr[2]);
			book.setPrice(Integer.parseInt(arr[3]));
			list.add(book);
		}
		br.close();
	}
	
	public void displayBooks() {
		// ArrayList에 저장된 책정보를 화면에 출력하기
		
		for (Book book : list) {
			System.out.println("제목: "+ book.getTitle() + ", 저자: " + book.getAuther() + ", 출판사: " + book.getPub() + ", 가격: " + book.getPrice() + "원");
		}
	}
	
	public void addBook(Book book) {
		// 전달받은 책정보를 ArrayList에 저장하기
		list.add(book);
	}
	
	public void saveBooks() throws IOException {
		// ArrayList에 저장된 책정보를 books.txt 파일에 저장하기(덮어쓰기)
		PrintWriter writer = new PrintWriter("books.txt");
		for (Book book : list) {
			writer.println(book);
		}
		writer.flush();
		writer.close();
	}
}
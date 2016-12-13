package file.demo;

public class Book {

	private String title;
	private String auther;
	private String pub;
	private int price;
	
	public Book() {}

	public Book(String title, String auther, String pub, int price) {
		super();
		this.title = title;
		this.auther = auther;
		this.pub = pub;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
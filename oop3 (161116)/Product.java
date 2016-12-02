public class Product {
	int no;
	String name;
	String maker;
	int price;
	double discountRate;

	public Product() {
	
	}

	public Product(int no, String name, String maker, int price, double discountRate) {
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.discountRate = discountRate;
	}

	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getMaker() {
		return maker;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public double getDiscountPrice() {
		return (int) (price * (1 - discountRate));
	}

	public void Info() {
		System.out.printf("%d %s %s %d %f\n", no, name, maker, price, discountRate);
	}
}
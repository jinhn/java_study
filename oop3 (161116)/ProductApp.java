public class ProductApp {
	public static void main(String[] args) {
		
		Product p1 = new Product(10, "아이패드", "애플", 1000000, 0.05);
		Product p2 = new Product(12, "맥북 프로", "애플", 2500000, 0.1);
		Product p3 = new Product(13, "아이폰", "애플", 850000, 0);

		p1.Info();
		p2.Info();
		p3.Info();
	}
}
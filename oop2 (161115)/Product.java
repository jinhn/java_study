public class Product {
	// 속성
	// 상품번호, 상품명, 제조사, 가격, 할인율(실수), 판매여부
	int no;
	String productName;
	String manufacturer;
	int price;
	double discountRate;
	boolean isSale;
	// 생성자
	// 기본생성자, 매개변수 있는 생성자
	public Product() {
	
	}

	public Product(int a, String b, String c, int d, double e, boolean f) {
		no = a;
		productName = b;
		manufacturer = c;
		price = d;
		discountRate = e;
		isSale = f;
	}
	// 기능
	// 할인된 가격을 반환하는 메소드
	// 상품정보를 모두 출력하는 메소드(할인가 포함)

	public int discountedPrice() {
		double value = price*discountRate;
		return (int)value;
	}

	public void productInfo() {
		System.out.println("########상품정보########");
		System.out.println("상품번호: " + no);
		System.out.println("상품명: " + productName);
		System.out.println("제조사: " + manufacturer);
		System.out.println("가격: " + price + "원");
		System.out.println("할인율: " + discountRate*100 + "%");
		System.out.println("할인가: " + (price - discountedPrice()) + "원");
		System.out.println("판매여부: " + isSale);
		System.out.println("########################");
	}
}
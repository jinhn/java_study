public class ProductApp {
	public static void main(String[] args) {
	
	// 상품을 5개 담는 배열을 정의하기
		Product[] products = new Product[5];

	// 배열에 상품 5개 저장하기
		products[0] = new Product(1, "빼빼로", "롯데", 1000, 0.1, true);
		products[1] = new Product(2, "콘칩", "농심", 1300, 0.2, true);
		products[2] = new Product(3, "초코파이", "오리온", 3000, 0.5, true);
		products[3] = new Product(4, "새우깡", "농심", 1500, 0.2, false);
		products[4] = new Product(5, "과자선물세트", "해태", 20000, 0.4, false);

	// 배열에 저장된 상품중에서 판매중인 상품만 표시하기
		for (Product p : products) {
			if (p.isSale == true) {
				System.out.println(p.productName + " 판매중인 상품입니다.");
			}
		}
		System.out.println();

	// 배열에 저장된 상품중에서 가격이 10000원 이상인 상품만 표시하기
		for (Product p : products) {
			if (p.price >= 10000) {
				System.out.println(p.productName + " 가격이 " + p.price + "원 입니다.");
			}
		}
		System.out.println();
	// 배열에 저장된 상품의 전체 가격을 표시하기
		for (Product p : products) {
			System.out.println(p.productName + " 가격이 " + p.price + "원 입니다.");
		}
		System.out.println();
	// 상품정보표시하기
		for (Product p : products) {
			p.productInfo();
			System.out.println();
		}
	}
}
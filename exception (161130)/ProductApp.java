import java.io.*;

public class ProductApp {
	
	// 상품정보 한 줄을 전달받아서 구분자로 잘라서
	// Product객체에 담아서 반환하는 메소드
	public static Product parseData(String text) {
		
		Product p = new Product();

		String[] arr = text.split(",");

		p.setName(arr[0]);
		p.setMaker(arr[1]);
		int price = Integer.parseInt(arr[2]);
		p.setPrice(price);
		double discount = Double.parseDouble(arr[3]);
		p.setDiscount(discount);

		return p;
	}

	public static void main(String[] args) throws Exception {
	
		Product[] products = new Product[4];

		BufferedReader reader = new BufferedReader(new FileReader("product.txt"));
		String text1 = reader.readLine();
		String text2 = reader.readLine();
		String text3 = reader.readLine();
		String text4 = reader.readLine();

		products[0] = parseData(text1);
		products[1] = parseData(text2);
		products[2] = parseData(text3);
		products[3] = parseData(text4);

		for (Product returnP : products) {
			System.out.println("------상품정보------");
			System.out.println("상품명: " + returnP.getName());
			System.out.println("제조사: " + returnP.getMaker());
			System.out.println("가  격: " + returnP.getPrice() + "원");
			System.out.println("할인율: " + returnP.getDiscount());
			System.out.println("--------------------");
		}
	}
}
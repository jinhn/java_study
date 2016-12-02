import java.io.*;

public class ProductApp {
	
	// ��ǰ���� �� ���� ���޹޾Ƽ� �����ڷ� �߶�
	// Product��ü�� ��Ƽ� ��ȯ�ϴ� �޼ҵ�
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
			System.out.println("------��ǰ����------");
			System.out.println("��ǰ��: " + returnP.getName());
			System.out.println("������: " + returnP.getMaker());
			System.out.println("��  ��: " + returnP.getPrice() + "��");
			System.out.println("������: " + returnP.getDiscount());
			System.out.println("--------------------");
		}
	}
}
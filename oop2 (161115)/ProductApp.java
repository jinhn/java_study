public class ProductApp {
	public static void main(String[] args) {
	
	// ��ǰ�� 5�� ��� �迭�� �����ϱ�
		Product[] products = new Product[5];

	// �迭�� ��ǰ 5�� �����ϱ�
		products[0] = new Product(1, "������", "�Ե�", 1000, 0.1, true);
		products[1] = new Product(2, "��Ĩ", "���", 1300, 0.2, true);
		products[2] = new Product(3, "��������", "������", 3000, 0.5, true);
		products[3] = new Product(4, "�����", "���", 1500, 0.2, false);
		products[4] = new Product(5, "���ڼ�����Ʈ", "����", 20000, 0.4, false);

	// �迭�� ����� ��ǰ�߿��� �Ǹ����� ��ǰ�� ǥ���ϱ�
		for (Product p : products) {
			if (p.isSale == true) {
				System.out.println(p.productName + " �Ǹ����� ��ǰ�Դϴ�.");
			}
		}
		System.out.println();

	// �迭�� ����� ��ǰ�߿��� ������ 10000�� �̻��� ��ǰ�� ǥ���ϱ�
		for (Product p : products) {
			if (p.price >= 10000) {
				System.out.println(p.productName + " ������ " + p.price + "�� �Դϴ�.");
			}
		}
		System.out.println();
	// �迭�� ����� ��ǰ�� ��ü ������ ǥ���ϱ�
		for (Product p : products) {
			System.out.println(p.productName + " ������ " + p.price + "�� �Դϴ�.");
		}
		System.out.println();
	// ��ǰ����ǥ���ϱ�
		for (Product p : products) {
			p.productInfo();
			System.out.println();
		}
	}
}
public class Product {
	// �Ӽ�
	// ��ǰ��ȣ, ��ǰ��, ������, ����, ������(�Ǽ�), �Ǹſ���
	int no;
	String productName;
	String manufacturer;
	int price;
	double discountRate;
	boolean isSale;
	// ������
	// �⺻������, �Ű����� �ִ� ������
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
	// ���
	// ���ε� ������ ��ȯ�ϴ� �޼ҵ�
	// ��ǰ������ ��� ����ϴ� �޼ҵ�(���ΰ� ����)

	public int discountedPrice() {
		double value = price*discountRate;
		return (int)value;
	}

	public void productInfo() {
		System.out.println("########��ǰ����########");
		System.out.println("��ǰ��ȣ: " + no);
		System.out.println("��ǰ��: " + productName);
		System.out.println("������: " + manufacturer);
		System.out.println("����: " + price + "��");
		System.out.println("������: " + discountRate*100 + "%");
		System.out.println("���ΰ�: " + (price - discountedPrice()) + "��");
		System.out.println("�Ǹſ���: " + isSale);
		System.out.println("########################");
	}
}
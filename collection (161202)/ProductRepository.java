import java.util.ArrayList;

public class ProductRepository {
	
	ArrayList<Product> db = new ArrayList<Product>();

	// ���ο� ��ǰ��ü�� ���޹޾Ƽ� �̸� ������ ArrayList�� �����ϴ� �޼ҵ�
	public void addProduct(Product item) {
		db.add(item);
	}

	// ��ǰ�̸��� ���޹޾Ƽ� ArrayList���� �� ��ǰ�̸��� �ش��ϴ� ��ǰ�� ã�Ƽ� ��ȯ�ϴ� �޼ҵ�
	public Product findProduct(String name) {
		Product result = null;

		return result;
	}

	// ArrayList�� ����� ��� ��ǰ������ ����ϴ� �޼ҵ�
	public void displayProducts() {
		for (Product pro : db) {
			System.out.printf("%d %s\n", pro.getNo(), pro.getName());
		}
	}
}
/*
���
1. �Է°��� �ϳ��� �о����
2. �Է°��� �� ������ �ִ� ��ü ����
3. �Է°��� ������ ��ü�� setter�� �̿��ؼ� ���
4. ���� ��� ��ü�� DB�� �������ִ� �޼ҵ忡 �����ϱ�
��ȸ
1. �Է��� ���� �о����
2. DB���� ��ǰ�� ã���ִ� �޼ҵ忡�� �Է°��� �����ϱ� 
*/
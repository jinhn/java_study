public class PhotoPrinter extends Printer {

	int size;

	// �θ�Ŭ����(Printer)�� print(String text)�޼ҵ� ������
	public void print(String data) {
		System.out.println("["+data+"]�� ������ȭ���� �μ��մϴ�.");
	}

	// PhotoPrinter�� ������ �������
	public void edit() {
		System.out.println("������ �����մϴ�.");
	}
};
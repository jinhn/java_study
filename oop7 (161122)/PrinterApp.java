public class PrinterApp {
	public static void main(String[] args) {
		
		// �޼ҵ� ������
		// ��Ӱ��迡 �ִ� Ŭ�����鰣��
		// ���� ������� ���� �޼ҵ���� �̸��� ����

		// ��� �μ�
		Printer p1 = new Printer();
		p1.feed();
		p1.print("�̹��� �ݿ��� ��Ÿ��ȸ...");
		System.out.println();

		// �÷� �μ�
		ColorPrinter p2 = new ColorPrinter();
		p2.print("�Ͽ糯 ���� ����");
		System.out.println();

		// ���� �μ�
		PhotoPrinter p3 = new PhotoPrinter();
		p3.print("�������");
		System.out.println();

	}
}
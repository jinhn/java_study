public class Demo3 {
	public static void main(String[] args) {
		// ���� ������
		// ���ǽ� ? ���϶� ����� Ȥ�� �� : �����϶�

		// ������ 60�� �̻��̸� �հ����� ����
		int score = 67;
		String result1 = (score >= 60 ? "�հ�" : "���հ�");
		System.out.println("���: " + result1);

		// ���űݾ��� 50000�� �̻��̸� ��ۺ� ����
		int price = 25000;
		int result2 = (price >= 50000 ? price : price + 2500);
		System.out.println("�����ݾ�: " + result2);
	}
}
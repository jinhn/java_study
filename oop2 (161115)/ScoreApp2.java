public class ScoreApp2 {
	public static void main(String[] args) {
	
	// ��ü ���� �� �������� �������� ��ü�� �ʱ�ȭ�Ǿ���
	Score s = new Score();

	// ������ ��ü�� �ʵ带 �ʱ�ȭ�ϴ� ������ ������ �� ����

	// �ٷ� ����� ����� ����
	int result1 = s.total();
	System.out.println("����: " + result1);

	double result2 = s.average();
	System.out.println("���: " + result2);
	}
}
public class Student {

	int no; // �й�
	String name;
	int kor;
	int eng;
	int math;

	// �⺻ ������
	public Student() {
	
	}
	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	public Student(int a, String b, int c, int d, int e) {
		no = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
	}
	// ������ ��ȯ�ϴ� ��� -> total
	public int total() {
		int value = kor + eng + math;
		return value;
	}
	// ����� ��ȯ�ϴ� ��� -> avg
	public double avg() {
		double value = total()/3.0;
		return value;
	}
	// �л������� ����ϴ� ���(������ ��յ� ����) -> info
	public void info() {
		System.out.println("######�л�����######");
		System.out.println("��    ��: " + no);
		System.out.println("��    ��: " + name);
		System.out.println("��������: " + kor);
		System.out.println("��������: " + eng);
		System.out.println("��������: " + math);
		System.out.println("��    ��: " + total());
		System.out.println("��    ��: " + avg());
		System.out.println("####################");
	}
}
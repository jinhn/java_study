public class B {
	int x;
	static int y;

	// m2()�� m4()�� ������ �� �ִ� ������
	// x, m1(), m3()�� ���� ���赵 �����̴�.
	// static �޼ҵ忡���� non-static������ ����� �� ����.

	// m1()�� ����� ������ ��ü�� ������� �����Ƿ� ��밡��
	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

	// static �޼ҵ忡���� non-static������ ����� �� ����.
	// this�� ����� �� ����.
	// x�� ��ü�� ��������� ���డ��
	// m2()�޼ҵ�� Ŭ������ �ε�Ǵ� ���� �ٷ� ���డ�ɻ����� �ݸ�
	// x�� ��ü ���� �� ������� ������ �����߻�
	public static void m2() {
		//System.out.println(x); // ������ ����
		System.out.println(y);
	}

	public void m3() {
		m1();
		m2();
	}

	// static �޼ҵ忡���� non-static������ ����� �� ����.
	public static void m4() {
		//m1(); // ������ ����
		m2();
	}
}
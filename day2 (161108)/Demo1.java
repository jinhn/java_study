public class Demo1 {
	public static void main (String[] args) {
		// ���� Ÿ��
		byte b1 = 23;
		byte b2 = -126;
		// byte b3 = 128; byte �ڷ����� ������ ��� ��

		int a1 = 128;
		int a2 = -128;

		long c1 = 10000;
		// ������ ������ int�� ������ ����� ���� ���
		// �ݵ�� ���� ���� L�� ǥ���ؾ� �Ѵ�.
		long c2 = 100000000000L;

		int m1 = 10;  // �������� 10 ǥ��
		int m2 = 012; // 8������ 10 ǥ��
		int m3 = 0xA; // 16������ 10 ǥ��

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		// Java7���� �ڸ����� ǥ���ϱ����ؼ� _��밡��
		int m4 = 100_000_000;
		int m5 = 5;
		System.out.println(m4 * m5);
	}
}
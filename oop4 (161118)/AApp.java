public class AApp {
	public static void main(String[] args) {
	
		// System.out.println(A.x); ��ü�� �����ؾ� x�� ��밡��
		// AApp.java:4: error: non-static variable x cannot be referenced from a static context
		
		System.out.println(A.y); // 0
		// static ����� Ŭ������.���� Ŭ������.�޼ҵ�() �������� ���

		// �������� y�� �� �Ҵ��ϱ�
		// AŬ������ ����ؼ� ���� ��� ��ü��
		// �������� y���� �����Ѵ�.
		//A.y = 100;

		// ������� x�� ������ ��ü���� ���������� �����ȴ�.
		// ������ ��ü�� ��ü���� �ٸ� x���� ���� �� �ִ�.
		A a1 = new A();
		//a1.x = 10;
		System.out.println("x: " + a1.x); // 10 // 1
		//System.out.println(a1.y); // 100
		// y���� ��µǱ�� ������, y���� ��������� ������ �� �ִ�.
		System.out.println("y: " + A.y); // 100 // 1

		A a2 = new A();
		//a2.x = 20;
		System.out.println("x: " + a2.x); // 20 // 1
		System.out.println("y: " + a2.y); // 100 // 2

		A a3 = new A();
		//a3.x = 30;
		System.out.println("x: " + a3.x); // 30 // 1
		System.out.println("y: " + a3.y); // 100 // 3

	}
}
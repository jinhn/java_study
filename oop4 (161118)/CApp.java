public class CApp {
	public static void main(String[] args) throws Exception {
	
		// �ش� Ŭ������ �޸𸮿� �ε������ִ� ��ɾ�
		// Class.forName("��ü Ŭ�����̸�");
		Class.forName("C");

		C c1 = new C();
		C c2 = new C();
		C c3 = new C();

		System.out.println(C.y);
		System.out.println(C.y);
		System.out.println(C.y);
	}
}
public class AccountApp {
	public static void main(String[] args) {
		
		Account a = new Account("ȫ�浿", "111-22-3333", 1234, 1000000);
/*
		System.out.println("������: " + a.owner); // owner�� �����Ҽ�����

		---------- ������ ----------
		AccountApp.java:5: error: owner has private access in Account
		System.out.println("������: " + a.owner);
                              ^
		1 error

		��� �Ϸ� (0�� ���) - ���� ����
*/
		System.out.println("������: " + a.getOwner());
		System.out.println("��й�ȣ: " + a.getPassword());
		a.Info();
	}
}
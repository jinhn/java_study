import java.util.Scanner;

public class ContactApp2As {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner sc = new Scanner(System.in);
		
		Contact[] contacts = new Contact[100];
		ContactMgr mgr = new ContactMgr();

		for (;;) {
			System.out.println("1:���  2:��ȸ  0:����");

			System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// �迭�� ����ϱ�
				// mgr�� addContact(Contact con1) �޼ҵ忡 ����� Con1��ü ����
				// ����ó ���� �Է¹ޱ�
				System.out.print("��ȣ�� �Է��ϼ���: ");
				int no = sc.nextInt();
				System.out.print("�̸��� �Է��ϼ���: ");
				String name = sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
				String phone = sc.next();
				System.out.print("�̸����� �Է��ϼ���: ");
				String email = sc.next();

				// con1��ü �����ϰ�, ���� ���
				Contact con1 = new Contact();
				con1.setNo(no);
				con1.setName(name);
				con1.setPhone(phone);
				con1.setEmail(email);

				mgr.addContact(con1);

			} else if (menuNo == 2) {
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ�
				// mgr�� displayContact()�� �����Ű��
				mgr.displayContact();
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}
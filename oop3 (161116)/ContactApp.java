import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for (;;) {
			System.out.println("1:���  2:��ȸ  0:����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// �迭�� ����ϱ�
				// �迭�� currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ�
				// currentPosition�� ���� 1������Ų��.
				Contact c = new Contact();
				contacts[currentPosition] = c;
				
				System.out.print("��ȣ�� �Է��ϼ���: ");
				c.setNo(sc.nextInt());

				System.out.print("�̸��� �Է��ϼ���: ");
				c.setName(sc.next());

				System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
				c.setPhone(sc.next());

				System.out.print("�̸����� �Է��ϼ���: ");
				c.setEmail(sc.next());

				currentPosition++;

			} else if (menuNo == 2) {
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ�
				// enhanced for�� ������� ���� ����
				// �迭���� ���´µ� null �̸� break
				// �迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ؼ� ���
				for (int i=0; i<contacts.length; i++) {
					if (contacts[i] == null) {
						break;
					} else {
						System.out.println("########����ó ����########");
						System.out.println("��ȣ: " + contacts[i].getNo());
						System.out.println("�̸�: " + contacts[i].getName());
						System.out.println("��ȭ��ȣ: " + contacts[i].getPhone());
						System.out.println("�̸���: " + contacts[i].getEmail());
						System.out.println("###########################");
						System.out.println();
					}
				}
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}
import java.util.Scanner;

public class ContactAppAs {
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

				// �迭�� �����ϱ�
				contacts[currentPosition] = con1;
				currentPosition++;

			} else if (menuNo == 2) {
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ�
				// enhanced for�� ������� ���� ����
				// �迭���� ���´µ� null �̸� break
				// �迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ؼ� ���
				for (int i=0; i<currentPosition; i++) {
					Contact con2 = contacts[i];

					System.out.println("########����ó ����########");
					System.out.println("��ȣ: " + con2.getNo());
					System.out.println("�̸�: " + con2.getName());
					System.out.println("��ȭ��ȣ: " + con2.getPhone());
					System.out.println("�̸���: " + con2.getEmail());
					System.out.println("###########################");
					System.out.println();
				}
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}
import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Account acc = new Account();

		for(;;) {
			System.out.println("1.��� 2.��ȸ 3.������� 4.�Ա� 5.��� 6.����\n");
		
			System.out.print("�޴� ���� > ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("�̸��� �Է��ϼ���: ");
				acc.setName(sc.next());
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				acc.setPassword(sc.nextInt());
				System.out.print("���� �Աݾ��� �Է��ϼ���: ");
				acc.setBalance(sc.nextInt());
				System.out.println("���°� �����Ǿ����ϴ�.");
			} else if (menuNo == 2) {
				System.out.println("########������ȸ########");
				System.out.println("�̸�: " + acc.getName());
				System.out.println("���¹�ȣ: " + acc.getAccountNumber());
				System.out.println("�ܾ�: " + acc.getBalance());
				System.out.println("########################");
			} else if (menuNo == 3) {
				System.out.print("���� ��й�ȣ�� �Է��ϼ���: ");
				int password = sc.nextInt();
				if (acc.getPassword() == password) {
					System.out.print("�� ��й�ȣ�� �Է��ϼ���: ");
					acc.setPassword(sc.nextInt());
					System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			} else if (menuNo == 4) {
				System.out.print("�Աݾ��� �Է��ϼ���: ");
				int deposit = sc.nextInt();
				acc.setBalance(acc.getBalance() + deposit);
				System.out.println("�ܾ��� " + acc.getBalance() + "�� �Դϴ�.");
			} else if (menuNo == 5) {
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				if (acc.getPassword() == sc.nextInt()) {
					System.out.print("��ݾ��� �Է��ϼ���: ");
					int withdraw = sc.nextInt();
					if (withdraw < acc.getBalance()) {
						acc.setBalance(acc.getBalance() - withdraw);
						System.out.println("�ܾ��� " + acc.getBalance() + "�� �Դϴ�.");
					}
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
				}
			} else if (menuNo == 6) {
				break;
			}
		}
	}
}
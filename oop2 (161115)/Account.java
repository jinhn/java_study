/*
������¸� ǥ���ϴ� Ŭ����
	- �Ӽ�
		������
		���¹�ȣ
		��й�ȣ
		�ܾ�
	- ���
		��ݱ�� - �ݾװ� ��й�ȣ�� ���޹޾Ƽ�
				   ��й�ȣ�� ������ �Է��� ��й�ȣ�� ��ġ�ϸ�
				   �ݾ׸�ŭ�� �ܾ׿��� ���ҽ�Ű��
				   �ݾ׸�ŭ�� ���� ��ȯ�Ѵ�.
		�Աݱ�� - �ݾ��� ���޹޾Ƽ� �� �ݾ׸�ŭ �ܾ��� ������Ű��
				   ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.
		��ȸ��� - ȭ�鿡 ������, ���¹�ȣ, �ܾ��� ǥ���Ѵ�.
*/
public class Account {

	String owner; // ������
	String accountNumber; // ���¹�ȣ
	int password; // ��й�ȣ
	int balance; // �ܾ�

	// ��ݱ��
	public int withdraw(int amount, int pwd) {
		int x = 0;
		if (password == pwd) {
			System.out.println(amount + "���� ��ݵǾ����ϴ�.");
			balance -= amount;
			System.out.println("�ܾ��� " + balance + "�� �Դϴ�.");
		} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		return x;
	}

/*
	public int withdraw(int amount, int pwd) {
		if (password != pwd) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return 0;
		}

		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}

		�� �κ��� ���ϸ��� �����κ� �߰��Ҷ�

		balance -= amount;
		System.out.println("��� �� �ܾ�: " + balance);
		return amount;
	}
*/

	// �Աݱ��
	public void deposit(int amount) {
		System.out.println(amount + "���� �ԱݵǾ����ϴ�.");
		balance += amount;
		System.out.println("�ܾ��� " + balance + "�� �Դϴ�.");
	}

	// ��ȸ���
	public void info() {
		System.out.println("########��������########");
		System.out.println("�� �� ��: " + owner);
		System.out.println("���¹�ȣ: " + accountNumber);
		System.out.println("��    ��: " + balance + "��");
	}
}
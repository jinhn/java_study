public class Contact {
	// �Ӽ� �����ϱ�
	
	// ����
	int no;
	// �̸�
	String name;
	// ����ó
	String phoneNum;
	// �̸���
	String email;
	
	// ��� �����ϱ�

	// ��ȭ�ϱ� call()
	public void call() {
		System.out.printf("%s(%S)���� ��ȭ�մϴ�.\n", name, phoneNum);
	}
	// ���ں����� sendMessage()
	public void sendMessage() {
		System.out.printf("%s(%s)���� ���ڸ� �����ϴ�.\n", name, phoneNum);
	}
	// ���Ϻ����� sendMail()
	public void sendMail() {
		System.out.printf("%s(%s)���� ������ �����ϴ�.\n", name, email);
	}
}
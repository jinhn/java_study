public class ContactMgrAs {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Con1 ��ü�� ���޹޾Ƽ� �迭�� �����ϱ�
	public void addContact(Contact con3) {
		contacts[currentPosition] = con3;
		currentPosition++;
	}

	// contacts �迭�� ����� ��� ����ó ���� ǥ���ϱ�
	public void displayContact() {
		for (int i=0; i<currentPosition; i++) {
			Contact con4 = contacts[i];

			System.out.println("########����ó ����########");
			System.out.println("��ȣ: " + con4.getNo());
			System.out.println("�̸�: " + con4.getName());
			System.out.println("��ȭ��ȣ: " + con4.getPhone());
			System.out.println("�̸���: " + con4.getEmail());
			System.out.println("###########################");
			System.out.println();
		}
	}
}
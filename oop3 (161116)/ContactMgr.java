public class ContactMgr {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact ��ü�� ���޹޾Ƽ� �迭�� �����ϱ�
	public void addContact(Contact contact) {
		contacts[currentPosition] = new Contact();
		contacts[currentPosition] = contact;
		currentPosition++;
	}

	// contacts �迭�� ����� ��� ����ó ���� ǥ���ϱ�
	public void displayContact() {
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
	}
}
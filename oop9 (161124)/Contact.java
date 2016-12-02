public class Contact {

	private String name;
	private Tel[] tels = new Tel[50];
	private Address address;

	public Contact() {}

	public Contact(String name, Tel[] tels, Address address) {
		this.name = name;
		this.tels = tels;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Tel[] getTels() {
		return tels;
	}

	int index;

	public void addTel(Tel tel) {
		// tels�迭�� ������ ��ġ�� ���
		tels[index++] = tel;
	}
	public void setTels(Tel[] tels) {
		this.tels = tels;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void getInfo() {
		System.out.println("��    ��: " + getName());
		for (int i=0; i<index; i++) {
			System.out.println("Ÿ    ��: " + tels[i].getType());
			System.out.println("��ȭ��ȣ: " + tels[i].getNumber());
		}
		System.out.println("��    ��: " + address.getZipcode() + " " + address.getSido() + " " + address.getGugun() + " " + address.getDetail());
	}
}
public class SmartPhone extends Phone {
	
	private String ip; // IP�ּ�

	public SmartPhone() {
		//super(); �� �����Ǿ�����
	}

	public SmartPhone(String telNumber, String company, String ip) {
		// �θ��� ������ ȣ���ϱ� Phone(String, String) ������
		super(telNumber, company);
		this.ip = ip;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public void displayInfo() {
		//System.out.println("��ȭ��ȣ: " + getTelNumber());
		//System.out.println("�� �� ��: " + getCompany());
		
		// �θ�Ŭ������ �ִ� ��ȭ��ȣ, ��Ż縦 ������
		super.displayInfo();
		System.out.println("�� �� ��: " + ip);
	}
}
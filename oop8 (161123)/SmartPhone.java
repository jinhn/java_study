public class SmartPhone extends Phone {
	
	private String ip; // IP주소

	public SmartPhone() {
		//super(); 가 생략되어있음
	}

	public SmartPhone(String telNumber, String company, String ip) {
		// 부모의 생성자 호출하기 Phone(String, String) 생성자
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
		//System.out.println("전화번호: " + getTelNumber());
		//System.out.println("통 신 사: " + getCompany());
		
		// 부모클래스에 있는 전화번호, 통신사를 가져옴
		super.displayInfo();
		System.out.println("아 이 피: " + ip);
	}
}
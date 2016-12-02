public class ContactMgrAs {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Con1 객체를 전달받아서 배열에 저장하기
	public void addContact(Contact con3) {
		contacts[currentPosition] = con3;
		currentPosition++;
	}

	// contacts 배열에 저장된 모든 연락처 정보 표시하기
	public void displayContact() {
		for (int i=0; i<currentPosition; i++) {
			Contact con4 = contacts[i];

			System.out.println("########연락처 정보########");
			System.out.println("번호: " + con4.getNo());
			System.out.println("이름: " + con4.getName());
			System.out.println("전화번호: " + con4.getPhone());
			System.out.println("이메일: " + con4.getEmail());
			System.out.println("###########################");
			System.out.println();
		}
	}
}
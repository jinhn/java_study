public class Contact {
	// 속성 정의하기
	
	// 순번
	int no;
	// 이름
	String name;
	// 연락처
	String phoneNum;
	// 이메일
	String email;
	
	// 기능 정의하기

	// 전화하기 call()
	public void call() {
		System.out.printf("%s(%S)에게 전화합니다.\n", name, phoneNum);
	}
	// 문자보내기 sendMessage()
	public void sendMessage() {
		System.out.printf("%s(%s)에게 문자를 보냅니다.\n", name, phoneNum);
	}
	// 메일보내기 sendMail()
	public void sendMail() {
		System.out.printf("%s(%s)에게 메일을 보냅니다.\n", name, email);
	}
}
public class PhoneApp2 {
	public static void main(String[] args) {
	
		SmartPhone   p1 = new SmartPhone();
		FeaturePhone p2 = new FeaturePhone();
		// p1참조변수는 SmartPhone을 참조하고 있기 때문에
		// SmartPhone객체의 필드와 속성에 접근가능하고,
		// Phone객체의 필드와 속성에 접근가능하다.

		p1.ip = "192.168.0.1";		// SmartPhone에 정의된 필드
		p1.web("www.naver.com");	// SmartPhone에 정의된 메소드
		p1.telNumber = "010-1234-5678";	// Phone에 정의된 필드
		p1.call("010-1111-1111");		// Phone에 정의된 메소드

		// SmartPhone과 FeaturePhone을 Phone타입의 참조변수에 담기
		// 상속관계에 있는 클래스일 경우
		// 부모타입의 참조변수에 자식클래스 타입의 객체를 저장할 수 있다.
		Phone p3 = new SmartPhone();
		Phone p4 = new FeaturePhone();

		//p3.web("www.daum.net");	// 에러
		p3.telNumber = "010-1234-1234";
		p3.call("010-2222-2222");

	}
}
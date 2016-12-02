public class ContactApp {
	public static void main(String[] args) {

		// 주소록정보(이름, 여러개의 전화번호, 주소)를 저장하는 객체 생성
		Contact contact = new Contact();

		// 이름 정보 저장
		String name = "홍길동";

		contact.setName(name);

		// 전화번호 정보 저장
		Tel[] phones = new Tel[10];

		Tel tel1 = new tel1;
		tel1.setType("폰");
		tel1.setNumber("010-2222-2222");
		phones[0] = tel1;

		Tel tel2 = new tel2;
		tel2.setType("직장");
		tel2.setNumber("02-333-3333");
		phones[1] = tel2;

		contact.setTels(phones);

		// 주소 정보 저장
		Address addr = new Address;
		addr.setSido("서울특별시");
		addr.setGugun("종로구");
		addr.setDetail("봉익동");

		contact.setAddress(addr);
	}
}
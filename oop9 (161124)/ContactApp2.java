import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Contact contact = new Contact();

		for (;;) {
			System.out.println("1.이름등록 2.전화번호등록 3.주소등록/수정 4.조회 0.종료");
			System.out.print("메뉴를 선택하세요: ");
			int no = sc.nextInt();
			if (no == 1) {
				// 이름을 입력받아서 Contact에 저장
				System.out.print("이름을 입력하세요: ");
				contact.setName(sc.next());

			} else if (no == 2) {
				// 전화번호 정보를 입력받아서 Contact에 저장
				// Tel객체 생성 -> 값 입력받아서 채우고
				// -> Contact의 addTel(Tel tel)에게 Tel객체 전달해서 배열에 담기
				Tel tel = new Tel();
				System.out.print("타입을 입력하세요: ");
				tel.setType(sc.next());
				System.out.print("전화번호를 입력하세요: ");
				tel.setNumber(sc.next());
				
				contact.addTel(tel);

			} else if (no == 3) {
				// 주소 정보를 입력받아서 Contact에 저장
				// Address객체 생성 -> 값 입력받아서 채우고 -> Contact의 setter 이용해서 저장
				Address addr = new Address();
				System.out.print("우편번호를 입력하세요: ");
				addr.setZipcode(sc.next());
				System.out.print("시를 입력하세요: ");
				addr.setSido(sc.next());
				System.out.print("구를 입력하세요: ");
				addr.setGugun(sc.next());
				System.out.print("상세주소를 입력하세요: ");
				addr.setDetail(sc.next());

				contact.setAddress(addr);

			} else if (no == 4)	{
				// 연락처 정보를 화면에 표시
				System.out.println("########연락처정보표시########");
				contact.getInfo();

			} else if (no == 0)	{
				// 프로그램을 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
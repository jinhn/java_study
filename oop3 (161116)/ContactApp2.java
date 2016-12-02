import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 관련 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
		Scanner sc = new Scanner(System.in);
		
		Contact[] contacts = new Contact[100];
		int currentPosition = 0;
		ContactMgr mgr = new ContactMgr();

		for (;;) {
			System.out.println("1:등록  2:조회  0:종료");

			System.out.print("메뉴 번호를 입력하세요: ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// 배열에 등록하기
				// mgr의 addContact(Contact contact) 메소드에 등록할 Contact객체 전달
				Contact c1 = new Contact();
				
				System.out.print("번호를 입력하세요: ");
				c1.setNo(sc.nextInt());

				System.out.print("이름을 입력하세요: ");
				c1.setName(sc.next());

				System.out.print("전화번호를 입력하세요: ");
				c1.setPhone(sc.next());

				System.out.print("이메일을 입력하세요: ");
				c1.setEmail(sc.next());
				mgr.addContact(c1);

			} else if (menuNo == 2) {
				// 배열에 저장된 모든 연락처 정보 표시하기
				// mgr의 displayContact()를 실행시키기
				mgr.displayContact();
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}
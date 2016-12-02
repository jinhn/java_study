import java.util.Scanner;

public class ContactApp2As {
	public static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 관련 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
		Scanner sc = new Scanner(System.in);
		
		Contact[] contacts = new Contact[100];
		ContactMgr mgr = new ContactMgr();

		for (;;) {
			System.out.println("1:등록  2:조회  0:종료");

			System.out.print("메뉴 번호를 입력하세요: ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// 배열에 등록하기
				// mgr의 addContact(Contact con1) 메소드에 등록할 Con1객체 전달
				// 연락처 정보 입력받기
				System.out.print("번호를 입력하세요: ");
				int no = sc.nextInt();
				System.out.print("이름을 입력하세요: ");
				String name = sc.next();
				System.out.print("전화번호를 입력하세요: ");
				String phone = sc.next();
				System.out.print("이메일을 입력하세요: ");
				String email = sc.next();

				// con1객체 생성하고, 값을 담기
				Contact con1 = new Contact();
				con1.setNo(no);
				con1.setName(name);
				con1.setPhone(phone);
				con1.setEmail(email);

				mgr.addContact(con1);

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
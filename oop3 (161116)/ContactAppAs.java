import java.util.Scanner;

public class ContactAppAs {
	public static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 관련 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for (;;) {
			System.out.println("1:등록  2:조회  0:종료");
			System.out.print("메뉴 번호를 입력하세요: ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// 배열에 등록하기
				// 배열에 currentPosition이 가르키는 위치에 Contact를 저장하고
				// currentPosition의 값을 1증가시킨다.

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

				// 배열에 저장하기
				contacts[currentPosition] = con1;
				currentPosition++;

			} else if (menuNo == 2) {
				// 배열에 저장된 모든 연락처 정보 표시하기
				// enhanced for문 사용하지 말고 구현
				// 배열에서 꺼냈는데 null 이면 break
				// 배열에서 0부터 currentPosition이 가르키는 위치 앞까지 반복해서 출력
				for (int i=0; i<currentPosition; i++) {
					Contact con2 = contacts[i];

					System.out.println("########연락처 정보########");
					System.out.println("번호: " + con2.getNo());
					System.out.println("이름: " + con2.getName());
					System.out.println("전화번호: " + con2.getPhone());
					System.out.println("이메일: " + con2.getEmail());
					System.out.println("###########################");
					System.out.println();
				}
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}
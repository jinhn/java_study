import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Account acc = new Account();

		for(;;) {
			System.out.println("1.등록 2.조회 3.비번변경 4.입금 5.출금 6.종료\n");
		
			System.out.print("메뉴 선택 > ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("이름을 입력하세요: ");
				acc.setName(sc.next());
				System.out.print("비밀번호를 입력하세요: ");
				acc.setPassword(sc.nextInt());
				System.out.print("최초 입금액을 입력하세요: ");
				acc.setBalance(sc.nextInt());
				System.out.println("계좌가 생성되었습니다.");
			} else if (menuNo == 2) {
				System.out.println("########계좌조회########");
				System.out.println("이름: " + acc.getName());
				System.out.println("계좌번호: " + acc.getAccountNumber());
				System.out.println("잔액: " + acc.getBalance());
				System.out.println("########################");
			} else if (menuNo == 3) {
				System.out.print("현재 비밀번호를 입력하세요: ");
				int password = sc.nextInt();
				if (acc.getPassword() == password) {
					System.out.print("새 비밀번호를 입력하세요: ");
					acc.setPassword(sc.nextInt());
					System.out.println("비밀번호가 변경되었습니다.");
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else if (menuNo == 4) {
				System.out.print("입금액을 입력하세요: ");
				int deposit = sc.nextInt();
				acc.setBalance(acc.getBalance() + deposit);
				System.out.println("잔액은 " + acc.getBalance() + "원 입니다.");
			} else if (menuNo == 5) {
				System.out.print("비밀번호를 입력하세요: ");
				if (acc.getPassword() == sc.nextInt()) {
					System.out.print("출금액을 입력하세요: ");
					int withdraw = sc.nextInt();
					if (withdraw < acc.getBalance()) {
						acc.setBalance(acc.getBalance() - withdraw);
						System.out.println("잔액은 " + acc.getBalance() + "원 입니다.");
					}
				} else {
					System.out.println("비밀번호가 틀렸습니다");
				}
			} else if (menuNo == 6) {
				break;
			}
		}
	}
}
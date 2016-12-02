/*
은행계좌를 표현하는 클래스
	- 속성
		예금주
		계좌번호
		비밀번호
		잔액
	- 기능
		출금기능 - 금액과 비밀번호를 전달받아서
				   비밀번호가 개설시 입력한 비밀번호와 일치하면
				   금액만큼을 잔액에서 감소시키고
				   금액만큼의 돈을 반환한다.
		입금기능 - 금액을 전달받아서 그 금액만큼 잔액을 증가시키고
				   화면에 현재 잔액을 표시한다.
		조회기능 - 화면에 예금주, 계좌번호, 잔액을 표시한다.
*/
public class Account {

	String owner; // 예금주
	String accountNumber; // 계좌번호
	int password; // 비밀번호
	int balance; // 잔액

	// 출금기능
	public int withdraw(int amount, int pwd) {
		int x = 0;
		if (password == pwd) {
			System.out.println(amount + "원이 출금되었습니다.");
			balance -= amount;
			System.out.println("잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		return x;
	}

/*
	public int withdraw(int amount, int pwd) {
		if (password != pwd) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return 0;
		}

		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}

		이 부분은 마일리지 결제부분 추가할때

		balance -= amount;
		System.out.println("출금 후 잔액: " + balance);
		return amount;
	}
*/

	// 입금기능
	public void deposit(int amount) {
		System.out.println(amount + "원이 입금되었습니다.");
		balance += amount;
		System.out.println("잔액은 " + balance + "원 입니다.");
	}

	// 조회기능
	public void info() {
		System.out.println("########계좌정보########");
		System.out.println("예 금 주: " + owner);
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("잔    액: " + balance + "원");
	}
}
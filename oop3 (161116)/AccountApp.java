public class AccountApp {
	public static void main(String[] args) {
		
		Account a = new Account("홍길동", "111-22-3333", 1234, 1000000);
/*
		System.out.println("예금주: " + a.owner); // owner에 접근할수없음

		---------- 컴파일 ----------
		AccountApp.java:5: error: owner has private access in Account
		System.out.println("예금주: " + a.owner);
                              ^
		1 error

		출력 완료 (0초 경과) - 정상 종료
*/
		System.out.println("예금주: " + a.getOwner());
		System.out.println("비밀번호: " + a.getPassword());
		a.Info();
	}
}
public class BankingApp {
	public static void main(String[] args) {
	
		Banking banking = new Banking("홍길동", "11-111", "1234", 1000000, false);
		
		try {
			banking.changePassword("1111", "2222");

			int money = banking.withdraw("2222", 200000000);
		} catch (BankingException e) {
			String errorMessage = e.getMessage();
			String errorCode = e.getErrorCode();
			System.out.println("오류 정보: [" + errorCode + "] " + errorMessage);
		}
	}
}
/*
---------- 실행 ----------
오류 정보: [ERR01] 비밀번호 변경 오류 [비밀번호 불일치]

출력 완료 (0초 경과) - 정상 종료
*/
public class BankingApp {
	public static void main(String[] args) {
	
		Banking banking = new Banking("ȫ�浿", "11-111", "1234", 1000000, false);
		
		try {
			banking.changePassword("1111", "2222");

			int money = banking.withdraw("2222", 200000000);
		} catch (BankingException e) {
			String errorMessage = e.getMessage();
			String errorCode = e.getErrorCode();
			System.out.println("���� ����: [" + errorCode + "] " + errorMessage);
		}
	}
}
/*
---------- ���� ----------
���� ����: [ERR01] ��й�ȣ ���� ���� [��й�ȣ ����ġ]

��� �Ϸ� (0�� ���) - ���� ����
*/
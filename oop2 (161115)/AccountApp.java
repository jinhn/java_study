public class AccountApp {
	public static void main(String[] args) {
		Account acc = new Account();

		acc.owner = "ȫ�浿";
		acc.accountNumber = "123-123-123456";
		acc.password = 1234;
		acc.balance = 100000;

		acc.withdraw(30000, 1234);
		System.out.println();
		
		acc.deposit(50000);
		System.out.println();
		
		acc.info();
	}
}